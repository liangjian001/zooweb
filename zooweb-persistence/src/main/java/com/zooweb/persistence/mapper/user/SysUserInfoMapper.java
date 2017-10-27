package com.zooweb.persistence.mapper.user;

import java.util.List;

import com.zooweb.modle.entities.user.SysUserInfo;

public interface SysUserInfoMapper {
	public List<SysUserInfo> selectUserList(SysUserInfo userInfo);
}
