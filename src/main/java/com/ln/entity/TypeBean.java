package com.ln.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 创作时间：2020/8/24 10:03
 * 作者：薛金博 HP
 */
@Data
public class TypeBean implements Serializable {
    private Long tid;
    private String tname;
}
