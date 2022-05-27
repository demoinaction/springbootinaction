package com.demoinaction.springannotation.component;

import com.demoinaction.springannotation.configuration.EmailConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailClient {

    @Autowired
    private EmailConfiguration emailConfiguration;
    public void send(){
        System.out.println(emailConfiguration.getSmptAddress());
        System.out.println("send email");

    }
}
