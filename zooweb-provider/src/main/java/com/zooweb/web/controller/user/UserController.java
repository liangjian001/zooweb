package com.zooweb.web.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.zooweb.business.service.user.SysUserService;
import com.zooweb.modle.dto.ResultInfo;
import com.zooweb.modle.entities.user.SysUser;
import com.zooweb.modle.entities.user.SysUserExample;
import com.zooweb.web.rabbitmq.CommonMessage;
import com.zooweb.web.rabbitmq.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired  
    private MessageSender messageSender;
    @Autowired
    private SysUserService sysUserService;
    
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/index")
	public String index(){
		 //测试查询数据
		SysUserExample example = new SysUserExample();
		ResultInfo resultInfo = sysUserService.getUserListData(example);
		if (resultInfo.getResultFlag()){
			List<SysUser> list = (List<SysUser>) resultInfo.getResultObject();
			System.out.println("查询到的数据条数："+list.size());
		} else {
			System.out.println("查询用户数据失败!");
		}
		return "index";
	}
	
	@RequestMapping(value="/getUserList")
	public String getUserList(){
		 System.out.println("查询用户数量......");
		 CommonMessage message = new CommonMessage();
		 message.setComments("查询一下系统目前用户数量");
		 message.setPrimaryKey("001");
	     message.setSource("1");
	     JSONObject obj = new JSONObject();  
	     obj.put("test", "test json message");  
	     obj.put("username", "user001");
	     obj.put("companyid", "10900011");
	     obj.put("operatedate", "2017-09-13");
	     message.setMessage(obj);  
	     messageSender.setRoutingKey("message.tonson");  
	     messageSender.sendDataToQueue(message);
		return "user/user";
	}
	
	@RequestMapping(value="/getUserInfo")
	public String getUserInfo(){
		System.out.println("查询指定用户的基本信息......");
		 CommonMessage message = new CommonMessage();
		 message.setComments("查询一下指定用户的基本信息");
		 message.setPrimaryKey("001");
	     message.setSource("2");
	     SysUser user = new SysUser();
	     user.setUserId("admin");
	     //JSONObject obj = JSONObject.parseObject(JSONObject.toJSONString(user));
	     message.setMessage(user);  
	     messageSender.setRoutingKey("message.tonson");  
	     messageSender.sendDataToQueue(message);
		return "user/user";
	}

	@RequestMapping(value = "/deleteUserById")
	public String deleteUserById(){
		return "";
	}
}
