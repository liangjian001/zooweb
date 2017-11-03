package com.zooweb.business.service.user;

import com.zooweb.modle.dto.ResultInfo;
import com.zooweb.modle.entities.user.SysUser;
import com.zooweb.modle.entities.user.SysUserExample;

public interface SysUserService {
	ResultInfo getUserListData(SysUserExample example);
	ResultInfo getUserListByEntity(SysUser user);
	ResultInfo insertUserInfo(SysUser user);
	int selectCountByEntity(SysUser user);
}
