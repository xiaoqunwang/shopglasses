package com.glasses.shopglasses.pojo;

import java.sql.Timestamp;

//订单表
public class ProductOrder extends BaseEntity{
    //订单ID
    private Integer orderId;

    // 用户ID
    private Integer UserId;
    // 手机号
    private String  phoneNumber;

    //是否退款，否：0 是：1
    private  Integer  refundType;

    //订单状态 (1.已下单，2.支付完成，3.配送中 4.签收)
    private  Integer  orderStatus;
    //订单金额
    private  Integer orderAmount;
    //订单数量
    private  Integer quantities;
    //渠道(微信)
    private  String  channelId;

    //支付方式
    private String payType;

    //下单时间
    private Timestamp orderTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getRefundType() {
        return refundType;
    }

    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Integer orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getQuantities() {
        return quantities;
    }

    public void setQuantities(Integer quantities) {
        this.quantities = quantities;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }


    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "ProductOrder{" +
                "orderId=" + orderId +
                ", UserId=" + UserId +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", refundType=" + refundType +
                ", orderStatus=" + orderStatus +
                ", orderAmount=" + orderAmount +
                ", quantities=" + quantities +
                ", channelId='" + channelId + '\'' +
                ", payType='" + payType + '\'' +
                ", orderTime=" + orderTime +
                '}';
    }
}
