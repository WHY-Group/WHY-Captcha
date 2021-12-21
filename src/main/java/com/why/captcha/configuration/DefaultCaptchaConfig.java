package com.why.captcha.configuration;

import org.springframework.context.annotation.Configuration;

/**
 * @author W
 * @description:
 * @title: Config
 * @projectName WHY-captcha
 * @date 2021/12/21
 * @company WHY-Group
 */
@Configuration
public class DefaultCaptchaConfig {
    /**
     * 验证码图片宽度
     */
    private int width = 200;
    /**
     * 验证码图片高度
     */
    private int height = 50;
    /**
     * 验证码位数
     */
    private int randomLength = 4;
    /**
     * 数值验证码最大取值数
     */
    private int mathCaptchaMaxNumber = 100;
    /**
     * 数值验证码最小取值数
     */
    private int mathCaptchaMinNumber = 1;


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRandomLength() {
        return randomLength;
    }

    public void setRandomLength(int randomLength) {
        this.randomLength = randomLength;
    }

    public int getMathCaptchaMaxNumber() {
        return mathCaptchaMaxNumber;
    }

    public void setMathCaptchaMaxNumber(int mathCaptchaMaxNumber) {
        this.mathCaptchaMaxNumber = mathCaptchaMaxNumber;
    }

    public int getMathCaptchaMinNumber() {
        return mathCaptchaMinNumber;
    }

    public void setMathCaptchaMinNumber(int mathCaptchaMinNumber) {
        this.mathCaptchaMinNumber = mathCaptchaMinNumber;
    }
}
