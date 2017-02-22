package com.cim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

@SpringBootApplication
public class CIMApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
        SpringApplication.run(CIMApplication.class, args);
    }
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CIMApplication.class);
	}
	
	/*
	@Bean  
	public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf){  
	    return hemf.getSessionFactory();  
	}  
	*/
	
	@Bean
	public HibernateJpaSessionFactoryBean sessionFactory() {
	    return new HibernateJpaSessionFactoryBean();
	}
}
