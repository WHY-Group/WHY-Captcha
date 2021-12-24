package com.why.captcha.listener;

import com.why.captcha.utils.RandomResult;

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
     * @param randomResult the randomStr
     * @author W
     * @date: 2021/12/24
     */
    void setRandomStr(RandomResult randomResult);
}
