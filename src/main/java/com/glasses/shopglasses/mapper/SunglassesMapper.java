package com.glasses.shopglasses.mapper;

import com.glasses.shopglasses.pojo.SunGlasses;
import org.apache.ibatis.annotations.*;


public interface SunglassesMapper {


    @Select("select * from glasses_sunglasses_product where sunglass_id=#{sunglassId} order by modified_time DESC limit 1")
    @Results({
            @Result(property = "sunglassId",  column = "sunglass_id"),
            @Result(property = "sunglassName", column = "sunglass_name"),
            @Result(property = "sunGlassBrandId", column= "sunglass_brand_id"),
            @Result(property = "sunGlassBrandName", column= "sunglass_brand_name"),
            @Result(property = "sunglassColor", column= "sunglass_color"),
            @Result(property = "sunglassStyle", column= "sunglass_style"),
            @Result(property = "eyeglassQuailty", column= "eyeglass_quailty"),
            @Result(property = "framesQuailty", column= "frames_quailty"),
            @Result(property = "sunglassShape", column= "sunglass_shape"),
            @Result(property = "sunglassFunction", column= "sunglass_function"),
            @Result(property = "sunglassModel", column= "sunglass_model"),
            @Result(property = "sunglassProArea", column= "sunglass_pro_area"),
            @Result(property = "sunglassCategory", column= "sunglass_category"),
            @Result(property = "sunglassSuitable", column= "sunglass_suitable"),
            @Result(property = "sunglassImage", column= "sunglass_image"),
            @Result(property = "sunglassWeight", column= "sunglass_weight"),
            @Result(property = "eyeglassWidth", column= "eyeglass_width"),
            @Result(property = "frameLegLength", column= "frame_leg_length"),
            @Result(property = "sunglassNoseWidth", column= "sunglass_nose_width"),
            @Result(property = "eyeglassHeigth", column= "eyeglass_heigth"),
            @Result(property = "sunglassPackSize", column= "sunglass_pack_size"),
            @Result(property = "quotedCompanyTime", column= "quoted_company_time"),
            @Result(property = "createTime", column= "create_time"),
            @Result(property = "modifiedTime", column= "modified_time")
    })
     SunGlasses getSunGlasses(@Param("sunglassId") Integer sunglassId);
}
