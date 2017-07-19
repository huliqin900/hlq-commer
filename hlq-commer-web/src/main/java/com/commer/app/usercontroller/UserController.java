package com.commer.app.usercontroller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/login")
    public ModelAndView login() {
		return new ModelAndView("login");
    }
	
	@RequestMapping("/submitBackstageLogin")
    public Object submitlogin(HttpServletRequest request,HttpSession session,HttpServletResponse response) throws IOException{  
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = userService.checkAdministratorsUser(username, password);
		
		//判断不存在该用户的情况下
		if (user == null) {
			return false;
		}
		session.setAttribute("user", user);
        return true;  
    }
	
	@RequestMapping("/customer_index")
    public ModelAndView BackstageIndex(HttpServletRequest request, HttpSession session) {
		
		//判断如果服务器存在用户session的话，不需要重新登录来访问该(配置拦截设置)
		if (session.getAttribute("user") != null)
            return new ModelAndView("customer_index");

        // 跳转登录页面
		return new ModelAndView("login");
    }
}
