package erick.br.chat.configuration.security;

import erick.br.chat.services.autentication.ServicesAutenticationUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@EnableWebSecurity
@Configuration
public class ConfigurationSecurity {

    @Autowired
    private ServicesAutenticationUser servicesAutenticationUser;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf.disable()

//                )
//                .sessionManagement(sessionManagement ->
//                        sessionManagement.sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED).maximumSessions(2)
//                )
                )

                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers(HttpMethod.GET, "/").permitAll()
                                .requestMatchers(HttpMethod.GET, "/login").permitAll()
                                .requestMatchers(HttpMethod.GET, "/create/user").permitAll()
                                .requestMatchers(HttpMethod.POST, "/create/newUser").permitAll()
                                .requestMatchers( "/chatgroup").permitAll()


                                .anyRequest().authenticated()
                )
                .formLogin(formLogin ->
                        formLogin
                                .loginPage("/login")
                                .defaultSuccessUrl("/chat")
                                .failureForwardUrl("/?error=true")
                )
                .logout(logout ->
                        logout
                                .invalidateHttpSession(true)
                                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                );

        return http.build();
    }



    @Bean
    public AuthenticationManager authenticationManager(HttpSecurity security) throws Exception {
        return security.getSharedObject(AuthenticationManagerBuilder.class).userDetailsService(servicesAutenticationUser)
                .passwordEncoder(bCryptPasswordEncoder()).and().build();
    }

    @Bean
    public PasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}



