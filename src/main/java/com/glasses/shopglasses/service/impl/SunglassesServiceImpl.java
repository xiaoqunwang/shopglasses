package com.glasses.shopglasses.service.impl;

import com.glasses.shopglasses.mapper.SunglassesMapper;
import com.glasses.shopglasses.pojo.SunGlasses;
import com.glasses.shopglasses.service.SunglassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service

public class SunglassesServiceImpl implements SunglassesService {

    @Autowired
    private SunglassesMapper sunmapper;

    /**
     *依据sunglassId获取太阳镜数据信息
     * @param sunglassId
     * @return
     */
    @Override
    public SunGlasses getSunGlasses(Integer sunglassId) {

        return sunmapper.getSunGlasses(sunglassId);
    }
}
