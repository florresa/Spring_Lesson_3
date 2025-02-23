package ru.netology.spring_lesson_1.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.spring_lesson_1.DevProfile;
import ru.netology.spring_lesson_1.ProductionProfile;
import ru.netology.spring_lesson_1.SystemProfile;

@Configuration
public class JavaConfig {
    @ConditionalOnProperty(name="netology.profile.dev", havingValue = "true")
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @ConditionalOnProperty(name="netology.profile.dev", havingValue = "false")
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
