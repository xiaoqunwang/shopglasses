package com.glasses.shopglasses.pojo;

//镜片产品详情信息
public class EyeGlasses extends BaseEntity {

    //镜片ID
    private Integer eyeglassId;
    //镜片名称
    private String eyeglassName;

    //品牌 ID
    private Integer eyeglassBrandId;

    //品牌 名称
    private String eyeglassBrandName;

    //镜片材质（树脂，PC,玻璃，天然材质）
    private String eyeglassQuailty;

    //近视度数（度数 近视100度，近视500度）
    private String eyeglassDegree;
    //散光度数（度数 散光0度，散光50度）
    private String astigmiaDegree;

    //功能（防蓝光 近视）
    private String eyeglassFunction;
    //折射率1.60（较薄,其他）
    private String refractivity;
    //产地（厦门...）
    private String eyeglassProArea;
    //分类（镜片）
    private String eyeglassCategory;
    //适用人群（男 女 通用 情侣 儿童）
    private String eyeglassSuitable;
    //镜片膜层（加硬膜 蓝膜）
    private String  eyeglassFilm;
    //镜面球面型：非球面
    private String  eyeglassShape;
    //图片
    private String  eyeglassImage;
    //规格
    //产品重量（21-39g(常规)）
    private String eyeglassWeight;
    //镜片宽度（75mm）
    private String eyeglassWidth;
    //镜片高度（56mm）
    private String eyeglassHeigth;

    public Integer getEyeglassId() {
        return eyeglassId;
    }

    public void setEyeglassId(Integer eyeglassId) {
        this.eyeglassId = eyeglassId;
    }

    public String getEyeglassName() {
        return eyeglassName;
    }

    public void setEyeglassName(String eyeglassName) {
        this.eyeglassName = eyeglassName;
    }

    public Integer getEyeglassBrandId() {
        return eyeglassBrandId;
    }

    public void setEyeglassBrandId(Integer eyeglassBrandId) {
        this.eyeglassBrandId = eyeglassBrandId;
    }

    public String getEyeglassBrandName() {
        return eyeglassBrandName;
    }

    public void setEyeglassBrandName(String eyeglassBrandName) {
        this.eyeglassBrandName = eyeglassBrandName;
    }

    public String getEyeglassQuailty() {
        return eyeglassQuailty;
    }

    public void setEyeglassQuailty(String eyeglassQuailty) {
        this.eyeglassQuailty = eyeglassQuailty;
    }

    public String getEyeglassDegree() {
        return eyeglassDegree;
    }

    public void setEyeglassDegree(String eyeglassDegree) {
        this.eyeglassDegree = eyeglassDegree;
    }

    public String getAstigmiaDegree() {
        return astigmiaDegree;
    }

    public void setAstigmiaDegree(String astigmiaDegree) {
        this.astigmiaDegree = astigmiaDegree;
    }


    public String getEyeglassFunction() {
        return eyeglassFunction;
    }

    public void setEyeglassFunction(String eyeglassFunction) {
        this.eyeglassFunction = eyeglassFunction;
    }

    public String getRefractivity() {
        return refractivity;
    }

    public void setRefractivity(String refractivity) {
        this.refractivity = refractivity;
    }

    public String getEyeglassProArea() {
        return eyeglassProArea;
    }

    public void setEyeglassProArea(String eyeglassProArea) {
        this.eyeglassProArea = eyeglassProArea;
    }

    public String getEyeglassCategory() {
        return eyeglassCategory;
    }

    public void setEyeglassCategory(String eyeglassCategory) {
        this.eyeglassCategory = eyeglassCategory;
    }

    public String getEyeglassSuitable() {
        return eyeglassSuitable;
    }

    public void setEyeglassSuitable(String eyeglassSuitable) {
        this.eyeglassSuitable = eyeglassSuitable;
    }

    public String getEyeglassFilm() {
        return eyeglassFilm;
    }

    public void setEyeglassSize(String eyeglassSize) {
        this.eyeglassFilm = eyeglassFilm;
    }

    public String getEyeglassShape() {
        return eyeglassShape;
    }

    public void setEyeglassShape(String eyeglassShape) {
        this.eyeglassShape = eyeglassShape;
    }

    public String getEyeglassImage() {
        return eyeglassImage;
    }

    public void setEyeglassImage(String eyeglassImage) {
        this.eyeglassImage = eyeglassImage;
    }

    public String getEyeglassWeight() {
        return eyeglassWeight;
    }

    public void setEyeglassWeight(String eyeglassWeight) {
        this.eyeglassWeight = eyeglassWeight;
    }

    public String getEyeglassWidth() {
        return eyeglassWidth;
    }

    public void setEyeglassWidth(String eyeglassWidth) {
        this.eyeglassWidth = eyeglassWidth;
    }

    public String getEyeglassHeigth() {
        return eyeglassHeigth;
    }

    public void setEyeglassHeigth(String eyeglassHeigth) {
        this.eyeglassHeigth = eyeglassHeigth;
    }

    @Override
    public String toString() {
        return "EyeGlasses{" +
                "eyeglassId=" + eyeglassId +
                ", eyeglassName='" + eyeglassName + '\'' +
                ", eyeglassBrandId='" + eyeglassBrandId + '\'' +
                ", eyeglassBrandName='" + eyeglassBrandName + '\'' +
                ", eyeglassQuailty='" + eyeglassQuailty + '\'' +
                ", eyeglassDegree='" + eyeglassDegree + '\'' +
                ", astigmiaDegree='" + astigmiaDegree + '\'' +
                ", eyeglassFunction='" + eyeglassFunction + '\'' +
                ", refractivity='" + refractivity + '\'' +
                ", eyeglassProArea='" + eyeglassProArea + '\'' +
                ", eyeglassCategory='" + eyeglassCategory + '\'' +
                ", eyeglassSuitable='" + eyeglassSuitable + '\'' +
                ", eyeglassSize='" + eyeglassFilm + '\'' +
                ", eyeglassShape='" + eyeglassShape + '\'' +
                ", eyeglassImage='" + eyeglassImage + '\'' +
                ", eyeglassWeight='" + eyeglassWeight + '\'' +
                ", eyeglassWidth='" + eyeglassWidth + '\'' +
                ", eyeglassHeigth='" + eyeglassHeigth + '\'' +
                '}';
    }
}
