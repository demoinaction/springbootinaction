package com.demoinaction.springannotation.email.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages = "com.demoinaction.springannotation.email.component")
public class EmailConfiguration {
    @Value("${smpt.address}")
    private String smptAddress;

    public String getSmptAddress() {
        return smptAddress;
    }

    //账户密码
}
