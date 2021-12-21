package com.why.captcha.producer.impl;

import com.why.captcha.configuration.DefaultCaptchaConfig;
import com.why.captcha.enums.RandomType;
import com.why.captcha.listener.CreateImageListener;
import com.why.captcha.producer.Producer;
import com.why.captcha.producer.RandomProducer;
import com.why.captcha.utils.RandomResult;

import java.awt.image.BufferedImage;

/**
 * @author chenglin.wu
 * @description:
 * @title: DefaultProducer
 * @projectName WHY-captcha
 * @date 2021/12/21
 * @company 上海织田信息技术有限公司 (Oda-Group)
 */
public class DefaultProducer implements Producer {
    /**
     * 创建验证码的配置类
     */
    private DefaultCaptchaConfig config;

    private DefaultRandomProducer defaultRandomProducer;


    @Override
    public BufferedImage createImage(CreateImageListener listener) {
        String randomStr = getRandomStr();
        listener.setRandomStr(randomStr);

        return null;
    }

    @Override
    public BufferedImage createImage(String text) {
        return null;
    }

    /**
     * 创建随机字符串
     *
     * @return String 随机字符串
     * @author W
     * @date: 2021/12/21
     */
    public String getRandomStr() {
        RandomResult randomResult = defaultRandomProducer.create();
        return randomResult.getRandomStr();
    }


    public void setConfig(DefaultCaptchaConfig config) {
        this.config = config;
    }

    public void setDefaultRandomProducer(DefaultRandomProducer defaultRandomProducer) {
        this.defaultRandomProducer = defaultRandomProducer;
    }

    public static void main(String[] args) {
        RandomResult randomResult = new RandomResult();

        DefaultProducer defaultProducer = new DefaultProducer();
        defaultProducer.setDefaultRandomProducer(new DefaultRandomProducer(RandomType.MIX_ENGLISH_AND_NUMBERS,new DefaultCaptchaConfig()));
        defaultProducer.createImage(randomResult::setRandomStr);

        System.out.println(randomResult.getRandomStr());

    }
}
