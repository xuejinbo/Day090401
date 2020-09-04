package com.ln.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 创作时间：2020/8/17 9:54
 * 作者：薛金博 HP
 */
@Data
public class CityBean implements Serializable {
    private Integer id;
    private Integer pid;
    private String cname;
    private Integer type;
}
