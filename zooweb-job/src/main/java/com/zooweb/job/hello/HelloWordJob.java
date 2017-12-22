package com.zooweb.job.hello;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.zooweb.business.service.user.SysUserService;
import com.zooweb.modle.dto.ResultInfo;
import com.zooweb.modle.entities.user.SysUser;

public class HelloWordJob implements Job {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SysUserService sysUserService;
	
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		 log.info("This is a first spring combine quartz !");
	     log.info("Welcome to Spring_Quartz World!"+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) );
	     log.info("Let's begin ! \n \n");
	     
	     SysUser entity = new SysUser();
			ResultInfo resultInfo = sysUserService.getUserListByEntity(entity);
			if (!resultInfo.getResultFlag()) {
				System.out.println("User data not found.");
			}else{
				@SuppressWarnings("unchecked")
				List<SysUser> listData = (List<SysUser>) resultInfo.getResultObject();
				System.out.println("查询出用户数量："+listData.size());
			}
	}

}
