package com.why.captcha.producer;

import com.why.captcha.listener.CreateImageListener;

import java.awt.image.BufferedImage;

/**
 * @author W
 * @description:
 * @title: Producer
 * @projectName WHY-captcha
 * @date 2021/12/21
 * @company WHY-Group
 */
public interface Producer {

    /**
     * 创建验证码图片，并生成随机字符
     * @param listener the listener
     * @return BufferedImage
     * @author W
     * @date: 2021/12/21
     */
    BufferedImage createImage(CreateImageListener listener);

    /**
     * 利用传进来的随机字符，创建验证码图片
     *
     * @param text the text
     * @return BufferedImage
     * @author W
     * @date: 2021/12/21
     */
    BufferedImage createImage(String text);
}
