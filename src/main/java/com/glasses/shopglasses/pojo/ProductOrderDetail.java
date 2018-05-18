package com.glasses.shopglasses.pojo;

//订单详情表
public class ProductOrderDetail extends ProductGlasses{
    //订单成本
    private Double cost;
    //单价
    private Double unit_price;

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }

    @Override
    public String toString() {
        return "ProductOrderDetail{" +
                "cost=" + cost +
                ", unit_price=" + unit_price +
                '}';
    }
}
