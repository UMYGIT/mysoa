package com.soap.mapper;

import java.util.List;

import com.soap.entity.RoleFormMap;
import com.soap.mapper.base.BaseMapper;

public interface RoleMapper extends BaseMapper{
	public List<RoleFormMap> seletUserRole(RoleFormMap map);
	
	public void deleteById(RoleFormMap map);
}
