package com.why.captcha.enums;

/**
 * @author W
 * @description:
 * @title: RandomType
 * @projectName WHY-captcha
 * @date 2021/12/21
 * @company WHY-Group
 */
public enum RandomType {
    /**
     * 纯数字类型
     */
    NUMBER("Number"),
    /**
     * 数学计算类型
     */
    MATH("Math"),
    /**
     * 纯英语字母
     */
    ENGLISH_LETTERS("English Letters"),
    /**
     * 英语字母和数字的混合
     */
    MIX_ENGLISH_AND_NUMBERS("Mix english and numbers");

    /**
     * 类型
     */
    private final String type;

    RandomType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
