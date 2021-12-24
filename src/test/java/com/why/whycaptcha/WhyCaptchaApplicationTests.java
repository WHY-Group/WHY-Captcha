package com.why.whycaptcha;

import com.why.captcha.configuration.DefaultCaptchaConfig;
import com.why.captcha.factory.ProducerFactory;
import com.why.captcha.producer.Producer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WhyCaptchaApplicationTests {

    @Test
    void contextLoads() {
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Producer producer = ProducerFactory.getProducer(new DefaultCaptchaConfig());

        System.out.println(producer.getRandomStr());

    }

}
