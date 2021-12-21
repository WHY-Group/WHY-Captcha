package com.why.captcha.producer;

import com.why.captcha.utils.RandomResult;

/**
 * @author W
 * @description:
 * @title: RandomProducer
 * @projectName WHY-captcha
 * @date 2021/12/21
 * @company WHY-Group
 */
public interface RandomProducer {
    /**
     * 创建随机字符串，数学计算
     * @return String
     * @author W
     * @date: 2021/12/21
     */
    RandomResult create();
}
