package com.zooweb.persistence.dao.user;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.zooweb.modle.entities.user.SysUserInfo;
import com.zooweb.persistence.mapper.user.SysUserInfoMapper;

@Repository
public class SysUserInfoDao {
	@Resource
	private SysUserInfoMapper sysUserInfoMapper;
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<SysUserInfo> selectUserList(SysUserInfo userInfo){
		return sysUserInfoMapper.selectUserList(userInfo);
		//return sqlSessionTemplate.selectList("com.mapper.user.UserInfoMapper.selectUserList", userInfo);
	}
}