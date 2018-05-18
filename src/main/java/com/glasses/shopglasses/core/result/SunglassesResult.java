package com.glasses.shopglasses.core.result;

import com.glasses.shopglasses.pojo.SunGlasses;

import javax.annotation.Resource;

public class SunglassesResult {

    private SunGlasses sunglasses;
    public  SunGlasses sunglassesResult() {

        return this.sunglasses;
    }

    public SunGlasses getSunglasses() {
        return sunglasses;
    }

    public void setSunglasses(SunGlasses sunglasses) {
        this.sunglasses = sunglasses;
    }
}
