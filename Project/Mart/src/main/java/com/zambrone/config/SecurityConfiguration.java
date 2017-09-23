package com.zambrone.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.filter.DelegatingFilterProxy;

/**
 * Created by Chamith on 10/09/2017.
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user1@gmail.com").password("password1").roles("ADMIN")
                .and().withUser("user2").password("password2").roles("MERCHANT").and()
                .withUser("user2@gmail.com").password("password2").roles("USER");
    }
    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordencoder());

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/css/*").permitAll()
                .antMatchers("/img/*").permitAll()
                .antMatchers("/signup").permitAll()
                .antMatchers("/").permitAll()
                .antMatchers("/js/*").permitAll()
                .antMatchers("/order/**").hasAnyRole("USER", "ADMIN")
                .antMatchers("/shop/explore").permitAll()
                .antMatchers("/place").hasAnyRole("USER", "ADMIN")
                .antMatchers("/admin/addcourier").hasRole("ADMIN")
                .antMatchers("/addcustomer").hasRole("ADMIN")
                .antMatchers("/admin/addshop").hasRole("ADMIN")
                .antMatchers("/order/update").hasAnyRole("USER", "ADMIN")
                .antMatchers("/shop/add").hasRole("ADMIN")
                .antMatchers("/shop/add").permitAll()
                .antMatchers("/seller").hasAnyRole("SELLER", "ADMIN")
                .antMatchers("/delivery").hasAnyRole("DELIVERY", "ADMIN")
                .antMatchers("/order/updateorder").hasAnyRole("USER", "ADMIN","SELLER")
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/product/*").permitAll()
                .antMatchers("/shop/addproduct").hasAnyRole("ADMIN","SELLER")
                .antMatchers("/service/admin").hasRole("ADMIN")
                .anyRequest().permitAll()
                .and()
                .formLogin().loginPage("/login")
                .usernameParameter("username").passwordParameter("password")
                .and()
                .logout().logoutSuccessUrl("/")
                .and()
                .exceptionHandling().accessDeniedPage("/noaccess")
                .and()
                .csrf();
    }

    @Bean(name="passwordEncoder")
    public PasswordEncoder passwordencoder(){
        return new BCryptPasswordEncoder();
    }


}