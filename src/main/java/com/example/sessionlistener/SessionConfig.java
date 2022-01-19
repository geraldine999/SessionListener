package com.example.sessionlistener;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SessionConfig {

    @Bean
    public ServletListenerRegistrationBean<MySessionListener> sessionListener() {
        ServletListenerRegistrationBean<MySessionListener> listenerRegBean =
                new ServletListenerRegistrationBean<>();


        listenerRegBean.setListener(new MySessionListener());
        return listenerRegBean;
    }
}
