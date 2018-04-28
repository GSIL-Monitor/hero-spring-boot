package com.test.project.auto;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.project.HeroAutoConfig;
import com.test.project.service.HelloWorldServiceIml;

/**
 * TODO 类描述
 *
 * @author hezun
 */
public class HeroAutoConfigTest {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(HeroAutoConfig.class));

    @Test
    public void defaultServiceBacksOff() {
        this.contextRunner.withUserConfiguration(HelloWorldConfig.class)
                .run((context) -> assertThat(context.getBean(HelloWorldServiceIml.class)).isSameAs(
                        context.getBean(HelloWorldConfig.class).myHelloService()));
    }

    @Configuration
    static class HelloWorldConfig {

        @Bean
        public HelloWorldServiceIml myHelloService() {
            return new HelloWorldServiceIml();
        }
    }
}
