package com.why.captcha;

import com.why.captcha.configuration.DefaultCaptchaConfig;
import com.why.captcha.factory.ProducerFactory;
import com.why.captcha.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;

/**
 * @author W
 * @description:
 * @title: TestController
 * @projectName WHY-captcha
 * @date 2021/12/24
 * @company WHY-Group
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private DefaultCaptchaConfig config;

    @GetMapping("/ping")
    public void ping(HttpServletResponse response) throws Exception {
        Producer producer = ProducerFactory.getProducer(config);

        BufferedImage image = producer.createImage(System.out::println);

        ImageIO.write(image, "jpg", response.getOutputStream());
    }
//    /**
//     * 将图片转换为输出流
//     *
//     * @return FastByteArrayOutputStream
//     * @author W
//     * @date 2021/5/16
//     */
//    private FastByteArrayOutputStream image2OutputStream(BufferedImage image) throws IOException {
//        FastByteArrayOutputStream outputStream = new FastByteArrayOutputStream();
//        ImageIO.write(image, "jpg", outputStream);
//        return outputStream;
//    }
}
