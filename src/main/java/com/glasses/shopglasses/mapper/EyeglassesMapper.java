package com.glasses.shopglasses.mapper;


import com.glasses.shopglasses.pojo.EyeGlasses;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface EyeglassesMapper {

    @Select("select * from glasses_eyeglasses_product where eyeglass_id=#{eyeglassId} order by modified_time DESC limit 1")
    @Results({
            @Result(property = "eyeglassId", column= "eyeglass_id"),
            @Result(property = "eyeglassName", column= "eyeglass_name"),
            @Result(property = "eyeglassBrandId", column= "eyeglass_brand_id"),
            @Result(property = "eyeglassBrandName", column= "eyeglass_brand_name"),
            @Result(property = "eyeglassQuailty", column= "eyeglass_quailty"),
            @Result(property = "eyeglassDegree", column= "eyeglass_degree"),
            @Result(property = "astigmiaDegree", column= "astigmia_degree"),
            @Result(property = "eyeglassFunction", column= "eyeglass_function"),
            @Result(property = "refractivity", column= "refractivity"),
            @Result(property = "eyeglassProArea", column= "eyeglass_pro_area"),
            @Result(property = "eyeglassCategory", column= "eyeglass_category"),
            @Result(property = "eyeglassSuitable", column= "eyeglass_suitable"),
            @Result(property = "eyeglassFilm", column= "eyeglass_film"),
            @Result(property = "eyeglassShape", column= "eyeglass_shape"),
            @Result(property = "eyeglassImage", column= "eyeglass_image"),
            @Result(property = "eyeglassWeight", column= "eyeglass_weight"),
            @Result(property = "eyeglassWidth", column= "eyeglass_width"),
            @Result(property = "eyeglassHeigth", column= "eyeglass_heigth"),
            @Result(property = "quotedCompanyTime", column= "quoted_company_time"),
            @Result(property = "createTime", column= "create_time"),
            @Result(property = "modifiedTime", column= "modified_time")
    })
    EyeGlasses geteyeGlasses(@Param("eyeglassId") Integer eyeglassId);
}
