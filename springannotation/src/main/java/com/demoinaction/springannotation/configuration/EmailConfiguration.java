package com.demoinaction.springannotation.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;

@Configurable
public class EmailConfiguration {
    @Value("${smpt.address}")
    private String smptAddress;

    public String getSmptAddress() {
        return smptAddress;
    }

    //账户密码
}
