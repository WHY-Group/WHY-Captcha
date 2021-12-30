package com.why.captcha.configuration;

import com.why.captcha.enums.CaptchaType;
import com.why.captcha.enums.RandomType;
import org.springframework.boot.context.properties.ConfigurationProperties;
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
@ConfigurationProperties(
        prefix = "captcha.config"
)
public class CaptchaConfig {
    /**
     * 全局配置验证码的类型
     */
    private CaptchaType captchaType = CaptchaType.DEFAULT;

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

    /**
     * 随机类型
     */
    private RandomType randomType = RandomType.MIX_ENGLISH_AND_NUMBERS;
    /**
     * 字体大小
     */
    private int fontSize=10;
    /**
     * 字体名
     */
    private String[] fontName;

    public RandomType getRandomType() {
        return randomType;
    }

    public void setRandomType(RandomType randomType) {
        if (CaptchaType.MATH.getType().equals(this.captchaType.getType())){
            this.randomType = RandomType.MATH;
        }else {
            this.randomType = randomType;
        }
    }

    public CaptchaType getCaptchaType() {
        return captchaType;
    }

    public void setCaptchaType(CaptchaType captchaType) {
        this.captchaType = captchaType;
        if (CaptchaType.MATH.getType().equals(captchaType.getType())){
            this.randomType = RandomType.MATH;
        }
    }

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

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String[] getFontName() {
        return fontName;
    }

    public void setFontName(String[] fontName) {
        this.fontName = fontName;
    }
}
