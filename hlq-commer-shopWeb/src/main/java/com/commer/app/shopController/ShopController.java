package com.commer.app.shopController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.commer.app.UserService.UserService;

@RestController 
@RequestMapping("/shop") 
public class ShopController {
	
	@Resource  
    private UserService userService;
	
	@GetMapping("")
    public ModelAndView login(HttpSession session) {
		return new ModelAndView("shop_home");
			
	}
	
	@GetMapping("/index")
    public ModelAndView ShowIndex() {
		return new ModelAndView("shop_home");
			
	}
}
