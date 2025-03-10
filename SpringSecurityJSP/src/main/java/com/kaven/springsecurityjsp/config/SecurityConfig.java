package com.kaven.springsecurityjsp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Disable CSRF for testing
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/login", "/register", "/home").permitAll() // Allow login and home access
                .anyRequest().authenticated()
            )
            .formLogin(login -> login
                .loginPage("/login") // Custom login page
                .loginProcessingUrl("/perform_login") // Match the form action
                .defaultSuccessUrl("/home", true) // Redirect on successful login
                .failureUrl("/login?error=true") // Redirect back on failure
                .permitAll()
            )
            .logout(logout -> logout
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login?logout=true")
                .permitAll()
            );

        return http.build();
    }
    
}
