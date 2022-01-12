package com.why.captcha.producer.impl;

import com.why.captcha.configuration.CaptchaConfig;
import com.why.captcha.constants.DefaultConfigConstants;
import com.why.captcha.listener.CreateImageListener;
import com.why.captcha.producer.Producer;
import com.why.captcha.producer.RandomProducer;
import com.why.captcha.utils.RandomResult;
import com.why.captcha.utils.RandomStrUtil;
import org.springframework.util.ObjectUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * @author chenglin.wu
 * @description:
 * @title: DefaultProducer
 * @projectName WHY-captcha
 * @date 2021/12/21
 * @company 上海织田信息技术有限公司 (Oda-Group)
 */
public class DefaultProducer implements Producer {

    private RandomProducer defaultRandomProducer;


    @Override
    public RandomProducer getRandomProducer() {
        return this.defaultRandomProducer;
    }

    @Override
    public void setRandomProducer(RandomProducer randomProducer) {
        this.defaultRandomProducer = randomProducer;
    }

    @Override
    public BufferedImage createImage(CreateImageListener listener) {
        RandomResult randomResult = defaultRandomProducer.create();
        listener.setRandomStr(randomResult);

        return paintingCode(randomResult.getRandomStr());
    }

    @Override
    public BufferedImage createImage(String text) {
        return paintingCode(text);
    }



    private BufferedImage paintingCode(String text){
        CaptchaConfig captchaConfig = defaultRandomProducer.getCaptchaConfig();
        BufferedImage bufferedImage = new BufferedImage(captchaConfig.getWidth(),captchaConfig.getHeight(),BufferedImage.TYPE_INT_RGB);
//        Graphics2D graphics = bufferedImage.createGraphics();
//        graphics.setBackground(Color.WHITE);
//        graphics.

        Graphics graphics = bufferedImage.getGraphics();
        graphics.setColor(Color.white);
        graphics.fillRect(0,0,captchaConfig.getWidth(),captchaConfig.getHeight());

        char[] chars = text.toCharArray();
        int length = chars.length;
        int x = captchaConfig.getWidth()/(length+1);
        int y = (captchaConfig.getHeight()+30)/2;

        for (int i = 0; i < length; i++) {
            String strChar = chars[i]+"";
            // 设置字体
            String defaultFont = DefaultConfigConstants.DEFAULT_FONT;
            String[] fontName = captchaConfig.getFontName();
            // 如果有配置字体则随机取用一个字体画当前值如果没有就使用默认的微软雅黑
            if (!ObjectUtils.isEmpty(fontName)){
                int randomFont = RandomStrUtil.nextInt(0, fontName.length - 1);
                defaultFont = fontName[randomFont];
            }
            Font font = new Font(defaultFont,Font.BOLD,captchaConfig.getFontSize());

            graphics.setFont(font);
            // 随机生成验证码颜色
            graphics.setColor(new Color(RandomStrUtil.nextInt(0,150), RandomStrUtil.nextInt(0,200), RandomStrUtil.nextInt(0,255)));
            graphics.drawString(strChar,(i+1)*x, y);
        }
        return bufferedImage;
    }

}
