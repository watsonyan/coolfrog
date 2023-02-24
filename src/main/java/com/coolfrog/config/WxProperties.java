package com.coolfrog.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "frog.wx")
@Data
public class WxProperties {

    private String appId;

    private String appSecret;

}
