package gmbh.conteco.schlungeinstieg.rmi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
public class RmiClient {

    @Bean
    public RmiProxyFactoryBean rmiProxy(
            @Value("${rmi.service.name}") String serviceName,
            @Value("${rmi.service.port}") int port
    ) {
        RmiProxyFactoryBean bean = new RmiProxyFactoryBean();
        bean.setServiceInterface(Calculator.class);
        bean.setServiceUrl("rmi://localhost:"+port+"/"+serviceName);
        return bean;
    }
}
