package com.why.captcha.enums;

/**
 * @author W
 * @description:
 * @title: CaptchaType
 * @projectName WHY-captcha
 * @date 2021/12/21
 * @company WHY-Group
 */
public enum CaptchaType {
    /**
     * 默认的普通验证码类型
     */
    DEFAULT("Default"),
    /**
     * 数学验证码类型
     */
    MATH("Math");
    /**
     * 类型
     */
    private final String type;


    CaptchaType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
