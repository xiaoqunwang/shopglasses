package com.glasses.shopglasses.pojo;

import java.io.Serializable;
import java.sql.Timestamp;


//抽象类
public abstract class BaseEntity implements Serializable {

    private Timestamp createTime;
    private Timestamp modifiedTime;
    //上市时间 (2014年春夏季)
    private String quotedCompanyTime;

}
