package com.zooweb.persistence.dao.user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.zooweb.modle.entities.user.SysUser;
import com.zooweb.modle.entities.user.SysUserExample;
import com.zooweb.persistence.mapper.user.SysUserMapper;

@Repository
public class SysUserDao {
	public List<SysUser> getUserListData(SqlSession sqlSession, SysUserExample example) {
		SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
		return mapper.selectByExample(example);
	}
	
	public List<SysUser> getUserListByEntity(SqlSession sqlSession,SysUser user){
		SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
		return mapper.getUserListByEntity(user);
	}
	
	public int insertUserInfo(SqlSession sqlSession,SysUser user){
		SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
		return mapper.insert(user);
	}
	
	public int selectCountByEntity(SqlSession sqlSession,SysUser user){
		SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
		return mapper.selectCountByEntity(user);
	}
	
}
