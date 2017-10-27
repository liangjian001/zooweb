package com.zooweb.api.service.user;

import java.util.List;

import com.zooweb.modle.entities.user.SysUserInfo;


public interface SysUserInfoService {
	/**
	 * 测试方法
	 * @return
	 */
	public String HelloTest(String str);
	
	public SysUserInfo getUserById(int id);
	
	public List<SysUserInfo> getUsers(SysUserInfo userInfo);
	
	public int insertUser(SysUserInfo userInfo);

	public int deleteUserById(int id);
}
