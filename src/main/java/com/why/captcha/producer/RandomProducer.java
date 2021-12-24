package com.why.captcha.producer;

import com.why.captcha.configuration.DefaultCaptchaConfig;
import com.why.captcha.utils.RandomResult;

/**
 * @author W
 * @description:
 * @title: RandomProducer
 * @projectName WHY-captcha
 * @date 2021/12/21
 * @company WHY-Group
 */
public abstract class RandomProducer {

    /**
     * 创建随机字符串，数学计算
     *
     * @return String
     * @author W
     * @date: 2021/12/21
     */
    public abstract RandomResult create();

    /**
     * 获取验证码配置
     *
     * @return DefaultCaptchaConfig
     * @author W
     * @date: 2021/12/24
     */
    public abstract DefaultCaptchaConfig getCaptchaConfig();

    /**
     * 设置验证码配置
     *
     * @param config the config
     * @author W
     * @date: 2021/12/24
     */
    public abstract void setCaptchaConfig(DefaultCaptchaConfig config);
}
