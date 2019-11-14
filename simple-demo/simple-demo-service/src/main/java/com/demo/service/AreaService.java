package com.demo.service;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.demo.dal.entity.Area;
import com.demo.dal.mapper.AreaMapper;
import com.demo.service.dto.AreaDTO;
import com.demo.service.mapper.AreaDTOMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService {
    private final AreaMapper areaMapper;

    public AreaService(AreaMapper areaMapper) {
        this.areaMapper = areaMapper;
    }

    public AreaDTO areaDTO() {
        final List<Area> areas = areaMapper.selectList(Wrappers.<Area>lambdaQuery().last("limit 1"));
        final Area area = areas.get(0);
        final AreaDTO areaDTO = AreaDTOMapper.INSTANCE.areaToAreaDto(area);
        return areaDTO;
    }
}
