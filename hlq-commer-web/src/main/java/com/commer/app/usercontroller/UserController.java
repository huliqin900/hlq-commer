package com.commer.app.usercontroller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.commer.app.UserService.UserService;
import com.commer.app.entity.User;

@Controller  
@RequestMapping("/user") 
public class UserController extends BaseController{
	private static Logger logger = Logger.getLogger(UserController.class);  
	   
	@Resource  
    private UserService userService;
	
	/*@Reference
    private UserService userService;*/
   
    /*  
     *  http://localhost:8080/user/getUserById?id=1  
     */  
   
	
//    @GetMapping(value = "getUserById") 
	@RequestMapping("/getUserById")
    public Object getUserById() {  
        User user = userService.selectByPrimaryKey(1);  
        if(user!=null){  
            System.out.println("user.getName():"+user.getUsername());  
            logger.info("user.getAge():"+user.getUsername());  
        }  
        return user;  
    }  
	
	@RequestMapping("/login")
    public Object login() {  
        return "login";  
    }
	
	@SuppressWarnings("unused")
	@RequestMapping("/submitlogin")
    public Object submitlogin(HttpServletRequest request){  
		String username = request.getParameter("username");
		String password = request.getParameter("password");
        return "register";  
    }
}
