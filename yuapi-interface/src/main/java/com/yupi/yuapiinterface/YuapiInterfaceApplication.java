package com.yupi.yuapiinterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * YuApi 模拟接口入口类
 *
 * @author <a href="https://github.com/booboil">程序员booboil</a>
 * booboil
 */
//@SpringBootApplication
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableWebMvc
public class YuapiInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuapiInterfaceApplication.class, args);
    }

}
