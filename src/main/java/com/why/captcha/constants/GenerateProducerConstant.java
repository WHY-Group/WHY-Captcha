package com.why.captcha.constants;

import com.why.captcha.enums.CaptchaType;
import com.why.captcha.enums.RandomType;

import java.util.HashMap;
import java.util.Map;

/**
 * @author W
 * @description:
 * @title: GenerateProducerConstant
 * @projectName WHY-captcha
 * @date 2021/12/24
 * @company WHY-Group
 */
public final class GenerateProducerConstant {

    private GenerateProducerConstant(){}

    /**
     * 保存随机数类型和产生类名的map
     */
    public static final Map<RandomType,String> RANDOM_PRODUCER_MAP = new HashMap<>(6);
    /**
     * 保存验证码类型和生成类的map
     */
    public static final Map<CaptchaType,String> CAPTCHA_TYPE_PRODUCER_MAP = new HashMap<>(6);

    static {
        RANDOM_PRODUCER_MAP.put(RandomType.MATH,"com.why.captcha.producer.impl.DefaultRandomProducer");
        RANDOM_PRODUCER_MAP.put(RandomType.MIX_ENGLISH_AND_NUMBERS,"com.why.captcha.producer.impl.DefaultRandomProducer");
        RANDOM_PRODUCER_MAP.put(RandomType.ENGLISH_LETTERS,"com.why.captcha.producer.impl.DefaultRandomProducer");
        RANDOM_PRODUCER_MAP.put(RandomType.NUMBER,"com.why.captcha.producer.impl.DefaultRandomProducer");

        CAPTCHA_TYPE_PRODUCER_MAP.put(CaptchaType.MATH,"com.why.captcha.producer.impl.DefaultProducer");
        CAPTCHA_TYPE_PRODUCER_MAP.put(CaptchaType.DEFAULT,"com.why.captcha.producer.impl.DefaultProducer");

    }
}
