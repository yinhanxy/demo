package com.example.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by yinh on 2019/7/24
 */
@Configuration
@MapperScan("com.example.demo.mbg.mapper")
public class MyBatisConfig {
}
