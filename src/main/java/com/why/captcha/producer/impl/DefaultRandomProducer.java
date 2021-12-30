package com.why.captcha.producer.impl;

import com.why.captcha.configuration.CaptchaConfig;
import com.why.captcha.enums.RandomType;
import com.why.captcha.producer.RandomProducer;
import com.why.captcha.utils.RandomResult;
import com.why.captcha.utils.RandomStrUtil;
import org.springframework.util.StringUtils;

/**
 * @author W
 * @description:
 * @title: DefaultRandomProducer
 * @projectName WHY-captcha
 * @date 2021/12/21
 * @company WHY-Group
 */
public class DefaultRandomProducer extends RandomProducer {
    /**
     * 随机类型
     */
    private  RandomType randomType;
    /**
     * 普通验证码的配置类
     */
    private CaptchaConfig config;

    /**
     * 数学方法中的加、减、乘、除运算符
     */
    private static final char[] MATH_BASIC_OPERATOR = {'+', '-', '*', '/'};

    public DefaultRandomProducer() {

    }

    public DefaultRandomProducer(CaptchaConfig config) {
        this.config = config;
        this.randomType = config.getRandomType();
    }

    @Override
    public RandomResult create() {
        RandomResult result = new RandomResult();
        switch (randomType) {
            case NUMBER:
                result.setRandomStr(RandomStrUtil.randomNumeric(config.getRandomLength()));
                break;
            case ENGLISH_LETTERS:
                result.setRandomStr(RandomStrUtil.randomAlphabetic(config.getRandomLength()));
                break;
            case MIX_ENGLISH_AND_NUMBERS:
                result.setRandomStr(RandomStrUtil.randomAlphanumeric(config.getRandomLength()));
                break;
            case MATH:
                this.createMathRandom(result);
                break;
            default:
                throw new IllegalArgumentException("Random type does not meet the requirements");
        }
        return result;
    }

    @Override
    public CaptchaConfig getCaptchaConfig() {
        return this.config;
    }

    @Override
    public void setCaptchaConfig(CaptchaConfig config) {
        this.config = config;
        this.randomType = config.getRandomType();
    }

    /**
     * 创建数值验证码的字符
     *
     * @param result 最终返回的结果
     * @author W
     * @date: 2021/12/21
     */
    private void createMathRandom(RandomResult result) {
        int numerber1 = RandomStrUtil.nextInt(config.getMathCaptchaMinNumber(), config.getMathCaptchaMaxNumber());
        int numerber2 = RandomStrUtil.nextInt(1, 100);
        String operator = RandomStrUtil.random(1, MATH_BASIC_OPERATOR);

        if ("+".equals(operator)) {
            result.setResult(numerber1 + numerber2 + "");
        } else if ("-".equals(operator)) {
            result.setResult(numerber1 - numerber2 + "");
        } else if ("*".equals(operator)) {
            result.setRandomStr(numerber1 + " x " + numerber2 + " =");
            result.setResult(numerber1 * numerber2 + "");
        } else {
            calculateDivision(numerber1, numerber2, result);
        }
        if (!StringUtils.hasText(result.getRandomStr())) {
            result.setRandomStr(numerber1 + " " + operator + " " + numerber2 + "=");
        }
    }

    /**
     * 计算除法的值，直到被除数 除以 除数能够除尽 余数为0
     *
     * @param dividend     被除数
     * @param divisor      除数
     * @param randomResult 返回的结果
     * @author W
     * @date: 2021/12/21
     */
    private void calculateDivision(int dividend, int divisor, RandomResult randomResult) {
        boolean dividedFlag = dividend % divisor == 0;
        if (dividedFlag) {
            int result = dividend / divisor;
            randomResult.setRandomStr(dividend + " / " + divisor + "=");
            randomResult.setResult(result + "");
        } else {
            divisor = RandomStrUtil.nextInt(config.getMathCaptchaMinNumber(), config.getMathCaptchaMaxNumber());
            calculateDivision(dividend, divisor, randomResult);
        }
    }

}
