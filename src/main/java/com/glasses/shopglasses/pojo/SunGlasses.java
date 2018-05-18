package com.glasses.shopglasses.pojo;

//太阳镜产品详情信息
public class SunGlasses  extends BaseEntity{

    private Integer sunglassId;//太阳镜ID
    private String sunglassName;//太阳镜名称

    //品牌 ID
    private Integer sunGlassBrandId;

    //品牌 名称
    private String sunGlassBrandName;

    //颜色（1.黑框黑镜面 玳瑁框   2.银框粉红片 …）
    private String sunglassColor;

    //风格（1.个性，2，舒适，前卫，优雅，简约，华丽，古典，运动，经典，潮流个性，百搭…）
    private String sunglassStyle;
    //镜片材质（树脂，PC,玻璃，天然材质）
    private String eyeglassQuailty;
    //镜架材质（钛合金属）
    private String framesQuailty;
    //镜框形状（椭圆形，圆形，方形，长方形，飞行员式，蝶式）
    private String sunglassShape;
    //功能（防UVA  防UVB  偏光 其他）
    private String sunglassFunction;
    //型号（F3026）
    private String sunglassModel;
    //产地（厦门...）
    private String sunglassProArea;
    //分类（偏光太阳镜，司机镜，蛤蟆镜）
    private String sunglassCategory;
    //适用人群（男 女 通用 情侣 儿童）
    private String sunglassSuitable;

    //图片
    private String  sunglassImage;


    //规格
    //产品重量（21-39g(常规)）
    private String sunglassWeight;
    //镜片宽度（75mm）
    private String eyeglassWidth;
    //镜腿长度(141mm)
    private String frameLegLength;
    //鼻中宽度（17mm）
    private String sunglassNoseWidth;
    //镜片高度（56mm）
    private String eyeglassHeigth;
    //包装尺寸（195*95*85 mm）
    private String sunglassPackSize;


    public Integer getSunglassId() {
        return sunglassId;
    }

    public void setSunglassId(Integer sunglassId) {
        this.sunglassId = sunglassId;
    }

    public String getSunglassName() {
        return sunglassName;
    }

    public void setSunglassName(String sunglassName) {
        this.sunglassName = sunglassName;
    }

    public Integer getSunGlassBrandId() {
        return sunGlassBrandId;
    }

    public void setSunGlassBrandId(Integer sunGlassBrandId) {
        this.sunGlassBrandId = sunGlassBrandId;
    }

    public String getSunGlassBrandName() {
        return sunGlassBrandName;
    }

    public void setSunGlassBrandName(String sunGlassBrandName) {
        this.sunGlassBrandName = sunGlassBrandName;
    }

    public String getSunglassColor() {
        return sunglassColor;
    }

    public void setSunglassColor(String sunglassColor) {
        this.sunglassColor = sunglassColor;
    }

    public String getSunglassStyle() {
        return sunglassStyle;
    }

    public void setSunglassStyle(String sunglassStyle) {
        this.sunglassStyle = sunglassStyle;
    }

    public String getEyeglassQuailty() {
        return eyeglassQuailty;
    }

    public void setEyeglassQuailty(String eyeglassQuailty) {
        this.eyeglassQuailty = eyeglassQuailty;
    }

    public String getFramesQuailty() {
        return framesQuailty;
    }

    public void setFramesQuailty(String framesQuailty) {
        this.framesQuailty = framesQuailty;
    }

    public String getSunglassShape() {
        return sunglassShape;
    }

    public void setSunglassShape(String sunglassShape) {
        this.sunglassShape = sunglassShape;
    }

    public String getSunglassFunction() {
        return sunglassFunction;
    }

    public void setSunglassFunction(String sunglassFunction) {
        this.sunglassFunction = sunglassFunction;
    }

    public String getSunglassModel() {
        return sunglassModel;
    }

    public void setSunglassModel(String sunglassModel) {
        this.sunglassModel = sunglassModel;
    }

    public String getSunglassProArea() {
        return sunglassProArea;
    }

    public void setSunglassProArea(String sunglassProArea) {
        this.sunglassProArea = sunglassProArea;
    }

    public String getSunglassCategory() {
        return sunglassCategory;
    }

    public void setSunglassCategory(String sunglassCategory) {
        this.sunglassCategory = sunglassCategory;
    }

    public String getSunglassSuitable() {
        return sunglassSuitable;
    }

    public void setSunglassSuitable(String sunglassSuitable) {
        this.sunglassSuitable = sunglassSuitable;
    }



    public String getSunglassImage() {
        return sunglassImage;
    }

    public void setSunglassImage(String sunglassImage) {
        this.sunglassImage = sunglassImage;
    }

    public String getSunglassWeight() {
        return sunglassWeight;
    }

    public void setSunglassWeight(String sunglassWeight) {
        this.sunglassWeight = sunglassWeight;
    }

    public String getEyeglassWidth() {
        return eyeglassWidth;
    }

    public void setEyeglassWidth(String eyeglassWidth) {
        this.eyeglassWidth = eyeglassWidth;
    }

    public String getFrameLegLength() {
        return frameLegLength;
    }

    public void setFrameLegLength(String frameLegLength) {
        this.frameLegLength = frameLegLength;
    }

    public String getSunglassNoseWidth() {
        return sunglassNoseWidth;
    }

    public void setSunglassNoseWidth(String sunglassNoseWidth) {
        this.sunglassNoseWidth = sunglassNoseWidth;
    }

    public String getEyeglassHeigth() {
        return eyeglassHeigth;
    }

    public void setEyeglassHeigth(String eyeglassHeigth) {
        this.eyeglassHeigth = eyeglassHeigth;
    }

    public String getSunglassPackSize() {
        return sunglassPackSize;
    }

    public void setSunglassPackSize(String sunglassPackSize) {
        this.sunglassPackSize = sunglassPackSize;
    }


    @Override
    public String toString() {
        return "SunGlasses{" +
                "sunglassId=" + sunglassId +
                ", sunglassName='" + sunglassName + '\'' +
                ", myopiaGlassBrandId=" + sunGlassBrandId +
                ", myopiaGlassBrandName='" + sunGlassBrandName + '\'' +
                ", sunglassColor='" + sunglassColor + '\'' +
                ", sunglassStyle='" + sunglassStyle + '\'' +
                ", eyeglassQuailty='" + eyeglassQuailty + '\'' +
                ", framesQuailty='" + framesQuailty + '\'' +
                ", sunglassShape='" + sunglassShape + '\'' +
                ", sunglassFunction='" + sunglassFunction + '\'' +
                ", sunglassModel='" + sunglassModel + '\'' +
                ", sunglassProArea='" + sunglassProArea + '\'' +
                ", sunglassCategory=" + sunglassCategory +
                ", sunglassSuitable='" + sunglassSuitable + '\'' +
                ", sunglassImage='" + sunglassImage + '\'' +
                ", sunglassWeight='" + sunglassWeight + '\'' +
                ", eyeglassWidth='" + eyeglassWidth + '\'' +
                ", frameLegLength='" + frameLegLength + '\'' +
                ", sunglassNoseWidth='" + sunglassNoseWidth + '\'' +
                ", eyeglassHeigth='" + eyeglassHeigth + '\'' +
                ", sunglassPackSize='" + sunglassPackSize + '\'' +
                '}';
    }
}
