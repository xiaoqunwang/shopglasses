package com.glasses.shopglasses.pojo;

//近视镜产品详情信息
public class MyopiaGlasses extends BaseEntity {
    //近视镜ID
    private Integer myopiaGlassId;
    //近视镜名称
    private String myopiaGlassName;


    //品牌 ID
    private Integer myopiaGlassBrandId;

    //品牌 名称
    private String myopiaGlassBrandName;

    //镜片材质（1.树脂，2.PC,3.玻璃，4.天然材质）
    private String eyeglassQuailty;

    //镜架材质（1.钛合金属）
    private String framesQuailty;

    //近视度数（度数 1.近视100度，2.近视500度）
    private String myopiaGlassDegree;

    //颜色（颜色 1.黑框黑镜面 玳瑁框  2. 银框粉红片 ）
    private String myopiaGlassColor;

    //风格（1.个性，2.舒适，3.前卫，4.优雅，5.简约，6.华丽，7.古典，8.运动，9.经典，10.潮流个性，11.百搭…)
    private String myopiaGlassStyle;

    //边框款式（1.全框，2.半框，3.无框）
    private String frameStyle;
    //功能（1.近视 ）
    private String myopiaGlassFunction;
    //折射率1.60（较薄,其他）
    private String refractivity;
    //产地（厦门...）
    private String myopiaGlassProArea;
    //分类（镜架）
    private String myopiaGlassCategory;
    //适用人群（男 女 通用 情侣 儿童）
    private String myopiaGlassSuitable;


    //图片
    private String myopiaGlassImage;


    //规格
    //产品重量（21-39g(常规)）
    private String myopiaGlassWeight;
    //镜片宽度（75mm）
    private String eyeglassWidth;
    //镜腿长度(141mm)
    private String frameLegLength;
    //鼻中宽度（17mm）
    private String myopiaGlassNoseWidth;
    //镜片高度（56mm）
    private String eyeglassHeigth;
    //包装尺寸（195*95*85 mm）
    private String myopiaGlassPackSize;


    public Integer getMyopiaGlassId() {
        return myopiaGlassId;
    }

    public void setMyopiaGlassId(Integer myopiaGlassId) {
        this.myopiaGlassId = myopiaGlassId;
    }

    public String getMyopiaGlassName() {
        return myopiaGlassName;
    }

    public void setMyopiaGlassName(String myopiaGlassName) {
        this.myopiaGlassName = myopiaGlassName;
    }

    public Integer getMyopiaGlassBrandId() {
        return myopiaGlassBrandId;
    }

    public void setMyopiaGlassBrandId(Integer myopiaGlassBrandId) {
        this.myopiaGlassBrandId = myopiaGlassBrandId;
    }

    public String getMyopiaGlassBrandName() {
        return myopiaGlassBrandName;
    }

    public void setMyopiaGlassBrandName(String myopiaGlassBrandName) {
        this.myopiaGlassBrandName = myopiaGlassBrandName;
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

    public String getMyopiaGlassDegree() {
        return myopiaGlassDegree;
    }

    public void setMyopiaGlassDegree(String myopiaGlassDegree) {
        this.myopiaGlassDegree = myopiaGlassDegree;
    }

    public String getMyopiaGlassColor() {
        return myopiaGlassColor;
    }

    public void setMyopiaGlassColor(String myopiaGlassColor) {
        this.myopiaGlassColor = myopiaGlassColor;
    }

    public String getMyopiaGlassStyle() {
        return myopiaGlassStyle;
    }

    public void setMyopiaGlassStyle(String myopiaGlassStyle) {
        this.myopiaGlassStyle = myopiaGlassStyle;
    }

    public String getFrameStyle() {
        return frameStyle;
    }

    public void setFrameStyle(String frameStyle) {
        this.frameStyle = frameStyle;
    }

    public String getMyopiaGlassFunction() {
        return myopiaGlassFunction;
    }

    public void setMyopiaGlassFunction(String myopiaGlassFunction) {
        this.myopiaGlassFunction = myopiaGlassFunction;
    }

    public String getRefractivity() {
        return refractivity;
    }

    public void setRefractivity(String refractivity) {
        this.refractivity = refractivity;
    }

    public String getMyopiaGlassProArea() {
        return myopiaGlassProArea;
    }

    public void setMyopiaGlassProArea(String myopiaGlassProArea) {
        this.myopiaGlassProArea = myopiaGlassProArea;
    }

    public String getMyopiaGlassCategory() {
        return myopiaGlassCategory;
    }

    public void setMyopiaGlassCategory(String myopiaGlassCategory) {
        this.myopiaGlassCategory = myopiaGlassCategory;
    }

    public String getMyopiaGlassSuitable() {
        return myopiaGlassSuitable;
    }

    public void setMyopiaGlassSuitable(String myopiaGlassSuitable) {
        this.myopiaGlassSuitable = myopiaGlassSuitable;
    }

    public String getMyopiaGlassImage() {
        return myopiaGlassImage;
    }

    public void setMyopiaGlassImage(String myopiaGlassImage) {
        this.myopiaGlassImage = myopiaGlassImage;
    }

    public String getMyopiaGlassWeight() {
        return myopiaGlassWeight;
    }

    public void setMyopiaGlassWeight(String myopiaGlassWeight) {
        this.myopiaGlassWeight = myopiaGlassWeight;
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

    public String getMyopiaGlassNoseWidth() {
        return myopiaGlassNoseWidth;
    }

    public void setMyopiaGlassNoseWidth(String myopiaGlassNoseWidth) {
        this.myopiaGlassNoseWidth = myopiaGlassNoseWidth;
    }

    public String getEyeglassHeigth() {
        return eyeglassHeigth;
    }

    public void setEyeglassHeigth(String eyeglassHeigth) {
        this.eyeglassHeigth = eyeglassHeigth;
    }

    public String getMyopiaGlassPackSize() {
        return myopiaGlassPackSize;
    }

    public void setMyopiaGlassPackSize(String myopiaGlassPackSize) {
        this.myopiaGlassPackSize = myopiaGlassPackSize;
    }


    @Override
    public String toString() {
        return "MyopiaGlasses{" +
                "myopiaGlassId=" + myopiaGlassId +
                ", myopiaGlassName='" + myopiaGlassName + '\'' +
                ", myopiaGlassBrandId=" + myopiaGlassBrandId +
                ", myopiaGlassBrandName='" + myopiaGlassBrandName + '\'' +
                ", eyeglassQuailty='" + eyeglassQuailty + '\'' +
                ", framesQuailty='" + framesQuailty + '\'' +
                ", myopiaGlassDegree='" + myopiaGlassDegree + '\'' +
                ", myopiaGlassColor='" + myopiaGlassColor + '\'' +
                ", myopiaGlassStyle='" + myopiaGlassStyle + '\'' +
                ", frameStyle='" + frameStyle + '\'' +
                ", myopiaGlassFunction='" + myopiaGlassFunction + '\'' +
                ", refractivity='" + refractivity + '\'' +
                ", myopiaGlassProArea='" + myopiaGlassProArea + '\'' +
                ", myopiaGlassCategory='" + myopiaGlassCategory + '\'' +
                ", myopiaGlassSuitable='" + myopiaGlassSuitable + '\'' +
                ", myopiaGlassImage='" + myopiaGlassImage + '\'' +
                ", myopiaGlassWeight='" + myopiaGlassWeight + '\'' +
                ", eyeglassWidth='" + eyeglassWidth + '\'' +
                ", frameLegLength='" + frameLegLength + '\'' +
                ", myopiaGlassNoseWidth='" + myopiaGlassNoseWidth + '\'' +
                ", eyeglassHeigth='" + eyeglassHeigth + '\'' +
                ", myopiaGlassPackSize='" + myopiaGlassPackSize + '\'' +
                '}';
    }
}
