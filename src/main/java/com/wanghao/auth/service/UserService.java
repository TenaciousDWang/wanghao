package com.wanghao.auth.service;

import java.util.HashMap;
import java.util.List;

import com.wanghao.auth.entity.UniCamelUser;
import com.wanghao.auth.entity.UniCamelUserExample;

public interface UserService {

	List<UniCamelUser> selectByExample(UniCamelUserExample example);
	
	int insert(UniCamelUser record);

	List<HashMap<String, Object>> selectAllPermission();

}