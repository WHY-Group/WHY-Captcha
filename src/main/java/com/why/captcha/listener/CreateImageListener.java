package com.why.captcha.listener;

/**
 * @author W
 * @description:
 * @title: CreateImageListener
 * @projectName WHY-captcha
 * @date 2021/12/21
 * @company WHY-Group
 */
@FunctionalInterface
public interface CreateImageListener {
    /**
     * 生成验证码图片时候的监听
     *
     * @param randomStr the randomStr
     * @author W
     * @date: 2021/12/24
     */
    void setRandomStr(String randomStr);
}
