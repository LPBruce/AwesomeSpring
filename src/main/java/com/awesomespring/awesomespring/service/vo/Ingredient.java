package com.awesomespring.awesomespring.service.vo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 构建领域类，本应用领域来自于《Spring实战》一书，练习使用。
 * 注解@RequiredArgsConstructor为非必须注解，具体参考Lombok插件相关注解
 * 
 */
@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
