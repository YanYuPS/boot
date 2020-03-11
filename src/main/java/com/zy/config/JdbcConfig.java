package com.zy.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import javax.sql.DataSource;
import java.beans.ConstructorProperties;

/**
 * 使用自动整合连接池，不再使用这个类
 */

//----//@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {

//    @Bean
//    public DataSource dataSource(JdbcProperties jdbc){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUrl(jdbc.getUrl());
//        dataSource.setDriverClassName(jdbc.getDriverClassName());
//        dataSource.setUsername(jdbc.getUsername());
//        dataSource.setPassword(jdbc.getPassword());
//        return dataSource;
//    }

//----//    @Bean
//----//    @ConfigurationProperties(prefix="jdbc") //属性只有这一个bean使用
//----//    public DataSource dataSource(){
//----//        return new DruidDataSource();
//----//    }

}
