package ru.netology.conditional.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.conditional.systemprofile.DevProfile;
import ru.netology.conditional.systemprofile.ProductionProfile;
import ru.netology.conditional.systemprofile.SystemProfile;

@Configuration
public class JavaConfig {

    @Bean
    @ConditionalOnProperty(prefix = "netology.profile", name = "dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(prefix = "netology.profile", name = "dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
