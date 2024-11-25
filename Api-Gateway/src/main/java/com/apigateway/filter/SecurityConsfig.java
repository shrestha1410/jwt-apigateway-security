// package com.apigateway.filter;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// public class SecurityConsfig {

//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http, CustomAuthenticationEntryPoint authEntryPoint) throws Exception {
//         http
//             .csrf().disable() // Disable CSRF for simplicity, adjust as needed
//             .exceptionHandling()
//             .authenticationEntryPoint(authEntryPoint) // Use your custom entry point
//             .and()
//             .authorizeHttpRequests()
//             .anyRequest().authenticated(); // Adjust the rules as per your needs

//         return http.build();
//     }
// }
