package com.glasses.shopglasses.pojo;

//产品总表
public class ProductGlasses extends  BaseEntity{
      //主键 产品ID
      private  Integer ProductId;
      //眼镜ID
      private Integer  glassesId;
      //眼镜名称
      private String  glassesName;
      //眼镜品牌 ID
      private  Integer glassesBrandId;
      //眼镜品牌 名称
      private  String glassesBrandName;

      //眼镜类别（1.近视镜 2.太阳镜 3.镜片）
      private Integer  glassesType;


    public Integer getProductId() {
        return ProductId;
    }

    public void setProductId(Integer productId) {
        ProductId = productId;
    }

    public Integer getGlassesId() {
        return glassesId;
    }

    public void setGlassesId(Integer glassesId) {
        this.glassesId = glassesId;
    }

    public String getGlassesName() {
        return glassesName;
    }

    public void setGlassesName(String glassesName) {
        this.glassesName = glassesName;
    }

    public Integer getGlassesBrandId() {
        return glassesBrandId;
    }

    public void setGlassesBrandId(Integer glassesBrandId) {
        this.glassesBrandId = glassesBrandId;
    }

    public String getGlassesBrandName() {
        return glassesBrandName;
    }

    public void setGlassesBrandName(String glassesBrandName) {
        this.glassesBrandName = glassesBrandName;
    }

    public Integer getGlassesType() {
        return glassesType;
    }

    public void setGlassesType(Integer glassesType) {
        this.glassesType = glassesType;
    }

    @Override
    public String toString() {
        return "ProductGlasses{" +
                "ProductId=" + ProductId +
                ", glassesId=" + glassesId +
                ", glassesName='" + glassesName + '\'' +
                ", glassesBrandId=" + glassesBrandId +
                ", glassesBrandName='" + glassesBrandName + '\'' +
                ", glassesType=" + glassesType +
                '}';
    }
}
