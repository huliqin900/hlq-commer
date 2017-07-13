package com.commer.app.UserService;

import com.commer.app.entity.User;

public interface UserService {
	
	//根据用户id获取用户信息
	User selectByPrimaryKey(Integer id);

	//系统管理员登录后台系统认证方法
	User checkAdministratorsUser(String username, String password);
}
