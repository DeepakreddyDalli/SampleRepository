package com.deepak.struts2;


import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

 
@SpringBootApplication
public class Application extends SpringBootServletInitializer implements ApplicationRunner{
     
	// Test
    @Autowired
    private UserService userService;
     
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
     
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        
    }
 
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
    	String fielName = getClass().getClassLoader().getResource("test/log4j2.xml").getFile();
    	System.out.println("fielName :"+fielName);
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        StrutsPrepareAndExecuteFilter struts = new StrutsPrepareAndExecuteFilter();
        registrationBean.setFilter(struts);
        registrationBean.setOrder(1);
        return registrationBean;
    }

	public void run(ApplicationArguments args) throws Exception {
		String fielName = getClass().getClassLoader().getResource("test/log4j2.xml").getFile();
		System.out.println("fielName :"+fielName);
		
	}
 
}
