package com.zooweb.job.order;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.zooweb.business.service.user.SysUserService;
import com.zooweb.modle.dto.ResultInfo;
import com.zooweb.modle.entities.user.SysUser;

public class OrderQuartzJob {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private SysUserService sysUserService;
	
	public void work(){
		  System.out.println("任务执行通知：Spring Quartz的订单任务调度被调用！");
		  //定时调用的业务逻辑
		  SysUser entity = new SysUser();
			ResultInfo resultInfo = sysUserService.getUserListByEntity(entity);
			if (!resultInfo.getResultFlag()) {
				System.out.println("User data not found.");
				log.info("User data not found.");
			}else{
				@SuppressWarnings("unchecked")
				List<SysUser> listData = (List<SysUser>) resultInfo.getResultObject();
				System.out.println("查询出用户数量："+listData.size());
				log.info("查询出用户数量："+listData.size());
			}
	}
}
