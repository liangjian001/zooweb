package com.zooweb.business.service.user;

import com.zooweb.modle.dto.ResultInfo;
import com.zooweb.modle.entities.user.SysUser;
import com.zooweb.modle.entities.user.SysUserExample;

public interface SysUserService {
	public ResultInfo getUserListData(SysUserExample example);
	public ResultInfo getUserListByEntity(SysUser user);
	public ResultInfo insertUserInfo(SysUser user);
	public int selectCountByEntity(SysUser user);
}
