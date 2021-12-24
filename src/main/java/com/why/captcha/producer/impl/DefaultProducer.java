package com.why.captcha.producer.impl;

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

    private RandomProducer defaultRandomProducer;


    @Override
    public RandomProducer getRandomProducer() {
        return this.defaultRandomProducer;
    }

    @Override
    public void setRandomProducer(RandomProducer randomProducer) {
        this.defaultRandomProducer = randomProducer;
    }

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
    @Override
    public String getRandomStr() {
        RandomResult randomResult = defaultRandomProducer.create();
        return randomResult.getRandomStr();
    }

}
