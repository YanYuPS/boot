package com.zy.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 使用自动整合连接池，不再使用这个类
 */

//@ConfigurationProperties(prefix = "jdbc")
@Data
public class JdbcProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
}
