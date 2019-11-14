package com.demo.service.mapper;

import com.demo.dal.entity.Area;
import com.demo.service.dto.AreaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AreaDTOMapper {
    AreaDTOMapper INSTANCE = Mappers.getMapper(AreaDTOMapper.class);

    AreaDTO areaToAreaDto(Area area);
}
