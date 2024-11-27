package com.lapangin.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/", "/css/**", "/js/**", "/login", "/register").permitAll()  // Izinkan akses tanpa login
                        .anyRequest().authenticated()  // Halaman lainnya memerlukan autentikasi
                )
                .formLogin(form -> form
                        .loginPage("/login")  // Halaman login
                        .defaultSuccessUrl("/dashboard", true)  // Redirect setelah login berhasil
                        .permitAll()
                )
                .logout(logout -> logout
                        .permitAll()  // Izinkan logout
                );

        return http.build();  // Mengembalikan objek konfigurasi
    }
}
