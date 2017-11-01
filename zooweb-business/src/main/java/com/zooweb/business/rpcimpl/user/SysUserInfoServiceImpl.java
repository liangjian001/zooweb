package com.zooweb.business.rpcimpl.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zooweb.api.service.user.SysUserInfoService;
import com.zooweb.modle.entities.user.SysUserInfo;
import com.zooweb.persistence.dao.user.SysUserInfoDao;

@Service
@Transactional
public class SysUserInfoServiceImpl implements SysUserInfoService {

	@Autowired
	private SysUserInfoDao sysUserInfoDao;
	
	@Override
	public String HelloTest(String str) {
		SysUserInfo userInfo = new SysUserInfo();
		List<SysUserInfo> list = sysUserInfoDao.selectUserList(userInfo);
		return "GOOD LUCK:>>>>>>~_~<<<<<<"+str+">>>查询到用户数量"+list.size();
	}
	
	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED)//容器不为这个方法开启事务
	public SysUserInfo getUserById(int id) {
		return null;
	}

	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysUserInfo> getUsers(SysUserInfo userInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)//如果有事务, 那么加入事务, 没有的话新建一个(默认情况下)
	public int insertUser(SysUserInfo userInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int deleteUserById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}


}
