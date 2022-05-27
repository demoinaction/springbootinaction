package com.demoinaction.springdemo;

import com.demoinaction.springannotation.annotation.EnableEmail;
import com.demoinaction.springannotation.component.EmailClient;
import com.demoinaction.springannotation.configuration.EmailConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableEmail
public class SpringdemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringdemoApplication.class, args);
        EmailClient bean = SpringContextUtil.getBean(EmailClient.class);
        bean.send();

    }

}
