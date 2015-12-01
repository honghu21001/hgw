/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//
//package sample.jsp;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.context.web.SpringBootServletInitializer;
//
////import sample.war.SampleWarApplication;
//
//
//@SpringBootApplication
//public class SampleWebJspApplication extends SpringBootServletInitializer {
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		application.web(true);
//		return application.sources(SampleWebJspApplication.class);
//	}
//
//	public static void main(String[] args) throws Exception {
//		//SpringApplication.run(SampleWebJspApplication.class, args);
//		
//		
//		SpringApplication app = new SpringApplication(SampleWebJspApplication.class);  
//        app.setWebEnvironment(true);  
//        app.setShowBanner(false);  
//        Set<Object> set = new HashSet<Object>();  
//        set.add("classpath:servlet.xml");  
//        app.setSources(set);  
//        app.run(args);  
//	}
//
//}
