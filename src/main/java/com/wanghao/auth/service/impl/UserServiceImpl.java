package com.wanghao.auth.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wanghao.auth.entity.UniCamelUser;
import com.wanghao.auth.entity.UniCamelUserExample;
import com.wanghao.auth.mapper.mysql.UniCamelMapper;
import com.wanghao.auth.mapper.mysql.UniCamelUserMapper;
import com.wanghao.auth.service.UserService;


@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UniCamelUserMapper uniCamelUserMapper;
	@Autowired
    private UniCamelMapper uniCamelMapper;

	@Override
	@Transactional
	public List<UniCamelUser> selectByExample(UniCamelUserExample example) {
		return uniCamelUserMapper.selectByExample(example);
	}

	@Override
	@Transactional
	public int insert(UniCamelUser record) {
		int i = 1/0;
		return uniCamelUserMapper.insert(record);
	}
	
	/**
	 * 加载所有权限
	 */
	@Override
	public List<HashMap<String, Object>> selectAllPermission() {
		return uniCamelMapper.getAllResourcesList();
	}
}
