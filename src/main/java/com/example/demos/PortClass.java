package com.example.demos;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.stereotype.Component;

@Component
    public class PortClass implements WebServerFactoryCustomizer< ConfigurableWebServerFactory >
    {
        @Override
        public void customize(ConfigurableWebServerFactory factory)
        {
            factory.setPort(8085);
        }
    }

