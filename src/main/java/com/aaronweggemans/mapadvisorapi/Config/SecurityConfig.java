package com.aaronweggemans.mapadvisorapi.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.List;

@Configuration
public class SecurityConfig {
    private final List<String> ACCEPTED_ORIGINS = List.of("https://adviezen.geolijn.nl/", "https://www.adviezen.geolijn.nl/", "http://localhost:4200");
    private final List<String> ACCEPTED_HEADERS = List.of("Origin", "Content-Type", "Authorization", "X-Requested-With", "Accept", "Cache-Control");
    private final List<String> ACCEPTED_METHODS = List.of("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH");

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();

        config.setAllowedOrigins(this.ACCEPTED_ORIGINS);
        config.setAllowedHeaders(this.ACCEPTED_HEADERS);
        config.setAllowedMethods(this.ACCEPTED_METHODS);

        config.setAllowCredentials(true);
        config.setExposedHeaders(List.of("Authorization"));

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);
    }
}
