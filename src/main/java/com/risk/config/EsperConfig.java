package com.risk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;

@Configuration
public class EsperConfig {

	@Bean
    public EPServiceProvider epServiceProvider() {
        com.espertech.esper.client.Configuration config = new com.espertech.esper.client.Configuration();

        //add event type 
        config.addEventTypeAutoName("com.risk.esper.event");

        EPServiceProvider epServiceProvider = EPServiceProviderManager.getDefaultProvider(config);
        // epServiceProvider.initialize();
        return epServiceProvider;
    }

    @Bean
    public EPAdministrator epAdministrator() {
        return epServiceProvider().getEPAdministrator();
    }

}
