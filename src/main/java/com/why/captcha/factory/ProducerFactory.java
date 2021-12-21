package com.why.captcha.factory;

import com.why.captcha.configuration.CaptchaGlobalConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author W
 * @description:
 * @title: ProducerFactory
 * @projectName WHY-captcha
 * @date 2021/12/21
 * @company WHY-Group
 */
@Component
public class ProducerFactory {
    @Autowired
    private CaptchaGlobalConfig config;

//    public Producer getProducer(){
//
//    }
}
