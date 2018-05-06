package com.soap.mapper;

import java.util.List;

import com.soap.entity.UserFormMap;
import com.soap.mapper.base.BaseMapper;


public interface UserMapper extends BaseMapper{

	public List<UserFormMap> findUserPage(UserFormMap userFormMap);
	
}
