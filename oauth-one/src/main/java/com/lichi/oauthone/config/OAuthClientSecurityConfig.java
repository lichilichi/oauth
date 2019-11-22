package com.lichi.oauthone.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author lichi
 * @create 2019-11-22 11:03
 */
@EnableOAuth2Sso
@Configuration
public class OAuthClientSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .antMatcher("/**")
                .authorizeRequests()
                .antMatchers("/","/login**")
                .permitAll()
                .anyRequest()
                .authenticated();
    }

    /**
     * 配置一个userDetailsService Bean不在生成默认security.user用户
     * 解决SpringBoot2.X中不支持security.basic.enabled=false
     * @return
     */
    @Bean
    @Override
    protected UserDetailsService userDetailsService() {
        return super.userDetailsService();
    }
}
