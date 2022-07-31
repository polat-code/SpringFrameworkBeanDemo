package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.print.Doc;

@Configuration
@ComponentScan(basePackages = "org.example")
public class BeanConfig {
    //After that we should remove @Component annotation from Doctor class.
    /* @Bean
    public Doctor doctor() {
        return new Doctor();
    }

     */

}
