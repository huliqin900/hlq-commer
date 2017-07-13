package com.commer.app.usercontroller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.commer.app.UserService.UserService;
import com.commer.app.entity.User;

@RestController  
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
    public ModelAndView login() {
		return new ModelAndView("login");
    }
	
	@RequestMapping("/submitBackstageLogin")
    public Object submitlogin(HttpServletRequest request,Model model){  
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = userService.checkAdministratorsUser(username, password);
		
		//判断不存在该用户的情况下
		if (user == null) {
			return false;
		}
		model.addAttribute("user", user);
        return "index";  
    }
}
