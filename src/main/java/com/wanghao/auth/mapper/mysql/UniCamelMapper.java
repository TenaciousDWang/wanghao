package com.wanghao.auth.mapper.mysql;

import java.util.HashMap;
import java.util.List;

public interface UniCamelMapper {
	List<HashMap<String,Object>> getUserRoleNameList(HashMap<String,Object> map);
	List<HashMap<String,Object>> getUserResourcesNameList(HashMap<String,Object> map);
	List<HashMap<String,Object>> getAllResourcesList();
}
