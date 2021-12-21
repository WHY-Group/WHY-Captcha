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
    void setRandomStr(String randomStr);
}
