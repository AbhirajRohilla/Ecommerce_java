package com.abhiraj.ecom_proj.confg;

import org.hibernate.Session;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

//        http.csrf(customizer -> customizer.disable());
//        http.authorizeHttpRequests(request-> request.anyRequest().authenticated());
//
//        //for login on browser
//        //we need to disable it for using stateless http hence commented out
////        http.formLogin(Customizer.withDefaults());
//
//        //for login on postman we need this
//        http.httpBasic(Customizer.withDefaults());
//
//        //to make http stateless
//        http.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));



        //writing all of the above things in builder pattern
        http.csrf(customizer -> customizer.disable())
                .authorizeHttpRequests(request-> request.anyRequest().authenticated())
                .httpBasic(Customizer.withDefaults())
                .sessionManagement(session->
                        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        return http.build();
    }
}
