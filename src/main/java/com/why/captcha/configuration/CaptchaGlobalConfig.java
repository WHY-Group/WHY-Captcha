package com.why.captcha.configuration;

import com.why.captcha.enums.CaptchaType;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author W
 * @description:
 * @title: CaptchaGlobalConfig
 * @projectName WHY-captcha
 * @date 2021/12/21
 * @company WHY-Group
 */
@Configuration
@ConfigurationProperties(
        prefix = "captcha.global"
)
public class CaptchaGlobalConfig {
    /**
     * 全局配置验证码的类型
     */
    private CaptchaType type;


    public CaptchaType getType() {
        return type;
    }

    public void setType(CaptchaType type) {
        this.type = type;
    }
}
