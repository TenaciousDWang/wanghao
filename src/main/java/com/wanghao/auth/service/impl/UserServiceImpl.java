package com.wanghao.auth.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wanghao.auth.entity.UniCamelUser;
import com.wanghao.auth.entity.UniCamelUserExample;
import com.wanghao.auth.mapper.mysql.UniCamelUserMapper;
import com.wanghao.auth.service.UserService;


@Service(value = "userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UniCamelUserMapper uniCamelUserMapper;

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

}
