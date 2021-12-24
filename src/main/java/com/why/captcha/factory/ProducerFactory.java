package com.why.captcha.factory;

import com.why.captcha.configuration.DefaultCaptchaConfig;
import com.why.captcha.constants.GenerateProducerConstant;
import com.why.captcha.enums.CaptchaType;
import com.why.captcha.enums.RandomType;
import com.why.captcha.producer.Producer;
import com.why.captcha.producer.RandomProducer;

/**
 * @author W
 * @description:
 * @title: ProducerFactory
 * @projectName WHY-captcha
 * @date 2021/12/21
 * @company WHY-Group
 */
public class ProducerFactory {

    public static Producer getProducer(DefaultCaptchaConfig config) throws Exception {
        // 获取随机数生成类和验证码生成类的类型
        RandomType randomType = config.getRandomType();
        CaptchaType captchaType = config.getCaptchaType();
        // 获取随机数生成类和验证码生成类的Class对象
        String captchaClassName = GenerateProducerConstant.CAPTCHA_TYPE_PRODUCER_MAP.get(captchaType);
        String randomClassName = GenerateProducerConstant.RANDOM_PRODUCER_MAP.get(randomType);
        Class<?> randomClass = Class.forName(randomClassName);
        Class<?> captchaClass = Class.forName(captchaClassName);
        // 创建随机数生成类对象
        RandomProducer randomProducer = (RandomProducer) randomClass.newInstance();
        randomProducer.setCaptchaConfig(config);
        // 创建验证码生成类对象
        Producer producer = (Producer) captchaClass.newInstance();
        producer.setRandomProducer(randomProducer);

        return producer;
    }
}
