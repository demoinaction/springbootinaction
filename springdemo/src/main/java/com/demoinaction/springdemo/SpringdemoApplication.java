package com.demoinaction.springdemo;

import com.demoinaction.springannotation.email.EnableEmail;
import com.demoinaction.springannotation.email.component.EmailClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableEmail(scanBasePackages = {"com.demoinaction.springannotation.email"})
public class SpringdemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringdemoApplication.class, args);
        EmailClient bean = SpringContextUtil.getBean(EmailClient.class);
        bean.send();

    }

}
