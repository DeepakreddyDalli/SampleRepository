package com.deepak.struts2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.opensymphony.xwork2.ActionSupport;

@Component
public class UserAction extends ActionSupport {
	 
    private static final long serialVersionUID = 1L;
    private List<User> users;
     
    @Autowired
    private UserService userService;
     
    public String execute() throws Exception {
        users =  userService.getUsers();
        return SUCCESS;
    }
    
    public String resetUsers() throws Exception {
    	
//    	RestTemplate restTemplate = new RestTemplate();
//    	String passWordChangeRestUrl= "XXXX";
//    	ResponseEntity<String> response
//    	  = restTemplate.getForEntity(passWordChangeRestUrl, String.class);
//    	if(response.getStatusCode() == HttpStatus.OK) {
//    		users =  userService.getUsers();
//    	}else {
//    		users = new  ArrayList<User>();
//    	}
    	
    	
    	    
    	
    	
    	String xmlString1 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n" + 
    			"    	<ChangePasswordRequest>\r\n" + 
    			"    	    <passwordResetFlag>true</passwordResetFlag>\r\n" + 
    			"    	</ChangePasswordRequest>";
    	
    	String xmlString2 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><ChangePasswordRequest><passwordResetFlag>true</passwordResetFlag>" ;
    	RestTemplate restTemplate = new RestTemplate();
    	String passWordChangeRestUrl= "XXXX";
    	ResponseEntity<String> response
    	  = restTemplate.getForEntity(passWordChangeRestUrl, String.class);
    	//
        
        return SUCCESS;
    }
 
    public List<User> getUsers(){
        return users;
    }
}