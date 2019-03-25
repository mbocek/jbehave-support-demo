package org.jbehavesupport.demo;

import org.jbehavesupport.core.web.WebSetting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class TestConfig {

    @Bean
    @Qualifier("GOOGLE")
    public WebSetting googleWebSettings() {
        return WebSetting.builder()
            .homePageUrl("https://www.google.com")
            .elementLocatorsSource("ui-mapping/*.yaml")
            .build();
    }
}
