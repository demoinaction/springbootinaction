package com.demoinaction.springannotation.email.component;

import com.demoinaction.springannotation.email.configuration.EmailConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmailClient {

    @Autowired
    private EmailConfiguration emailConfiguration;
    public void send(){
        System.out.println(emailConfiguration.getSmptAddress());
        System.out.println("send email");
    }
}
