package gmbh.conteco.schlungeinstieg.http;

import gmbh.conteco.schlungeinstieg.rmi.Calculator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

@Configuration
public class HTTPClient {
    @Bean
    @Qualifier("http")
    public HttpInvokerProxyFactoryBean invoker() {
        HttpInvokerProxyFactoryBean bean = new HttpInvokerProxyFactoryBean();
        bean.setServiceUrl("http://localhost:8080/calculator");
        bean.setServiceInterface(Calculator.class);
        return bean;
    }
}
