package com.commer.app.service.impl;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.commer.app.UserService.UserService;
import com.commer.app.entity.User;
import com.commer.app.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
	@Resource  
    private UserMapper userMapper;
	
	@Override
	public User selectByPrimaryKey(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

}
