package fsts.mrurespect.springclient.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import proxy.BanqueService;
import proxy.BanqueWS;

@Configuration
public class SoapBanqueClientConfig {

    @Bean
    public BanqueService banqueService() {
        return new BanqueWS().getBanqueServicePort();
    }
}
