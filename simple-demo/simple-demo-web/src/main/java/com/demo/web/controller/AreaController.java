package com.demo.web.controller;

import com.demo.service.dto.AreaDTO;
import com.demo.web.res.Result;
import com.demo.service.AreaService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaController {
    private final AreaService areaService;
    private final RedisTemplate<String, String> redisTemplate;

    public AreaController(AreaService areaService, RedisTemplate<String, String> redisTemplate) {
        this.areaService = areaService;
        this.redisTemplate = redisTemplate;
    }

    @GetMapping("test")
    public Result<AreaDTO> test() {
        final AreaDTO areaDTO = areaService.areaDTO();
        return Result.wrapSuccessResult(areaDTO);
    }

    @GetMapping("redis")
    public Result<String> testRedis() {
        redisTemplate.opsForValue().set("k1", "v2");
        final String k1 = redisTemplate.opsForValue().get("k1");
        return Result.wrapSuccessResult(k1);
    }
}
