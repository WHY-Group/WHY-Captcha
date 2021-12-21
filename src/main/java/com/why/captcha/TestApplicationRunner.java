package com.why.captcha;

import com.why.captcha.configuration.CaptchaGlobalConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author W
 * @description:
 * @title: TestApplicationRunner
 * @projectName WHY-captcha
 * @date 2021/12/21
 * @company WHY-Group
 */
@Slf4j
@Order(1)
@Component
public class TestApplicationRunner implements ApplicationRunner {
    @Autowired
    private CaptchaGlobalConfig globalConfig;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("global type :{}",globalConfig.getType().getType());
    }
}
