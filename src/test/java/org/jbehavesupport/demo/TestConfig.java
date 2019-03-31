package org.jbehavesupport.demo;

import org.jbehavesupport.core.report.XmlReporterFactory;
import org.jbehavesupport.core.report.extension.RestXmlReporterExtension;
import org.jbehavesupport.core.report.extension.TestContextXmlReporterExtension;
import org.jbehavesupport.core.rest.RestServiceHandler;
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

    @Bean
    @Qualifier("OWM")
    public RestServiceHandler testRestServiceHandler() {
        return new RestServiceHandler("http://api.openweathermap.org");
    }

    @Bean
    public XmlReporterFactory xmlReporterFactory() {
        return new XmlReporterFactory();
    }

    @Bean
    public TestContextXmlReporterExtension testContextXmlReporterExtension () {
        return new TestContextXmlReporterExtension();
    }

    @Bean
    public RestXmlReporterExtension restXmlReporterExtension() {
        return new RestXmlReporterExtension();
    }
}
