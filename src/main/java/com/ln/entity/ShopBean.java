package com.ln.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 创作时间：2020/8/24 10:01
 * 作者：薛金博 HP
 */
@Data
public class ShopBean implements Serializable {
    private Long id;
    private String name;
    private String tname;
    private Integer price;
    private String address;
    private Integer num;
    private Integer tid;

}
