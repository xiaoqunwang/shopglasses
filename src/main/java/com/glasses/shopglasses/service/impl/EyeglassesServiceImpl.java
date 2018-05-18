package com.glasses.shopglasses.service.impl;

import com.glasses.shopglasses.mapper.EyeglassesMapper;
import com.glasses.shopglasses.pojo.EyeGlasses;
import com.glasses.shopglasses.service.EyeglassesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EyeglassesServiceImpl implements EyeglassesService {

    @Resource
    private EyeglassesMapper eyeglassmapper;

    /**
     * 依据eyeglassId获取近视镜数据信息
     * @param eyeglassId
     * @return
     */
    public EyeGlasses geteyeGlasses(Integer eyeglassId){
          return  eyeglassmapper.geteyeGlasses(eyeglassId);
    }
}
