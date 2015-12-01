package com.syj;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

//import sample.jsp.SampleWebJspApplication;

@SpringBootApplication
//@ImportResource("classpath:dispatcher-servlet.xml")
public class Application extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {  
    
    @Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {  
        return builder.sources(Application.class);  
//    	SpringApplication app = new SpringApplication(Application.class); 88123

//        app.setWebEnvironment(true);  
//        app.setShowBanner(false);  
//
//        Set<Object> set = new HashSet<Object>();  
//        set.add("classpath:dispatcher-servlet.xml");  
//        return builder.sources(set);  
    }  
      
    public static void main(String[] args) {  
        SpringApplication.run(Application.class, args);  
        
//        SpringApplication app = new SpringApplication(Application.class);  
//        app.setWebEnvironment(true);  
//        app.setShowBanner(false);  
//
//        Set<Object> set = new HashSet<Object>();  
//        set.add("classpath:dispatcher-servlet.xml");  
//        app.setSources(set);  
//        app.run(args);  
    }  
  
  
//    @Override  
    public void customize(ConfigurableEmbeddedServletContainer container) {  
    	
//    	XmlWebApplicationContext appContext = new XmlWebApplicationContext();
        container.setPort(8081);  
    }  
}  