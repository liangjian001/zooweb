package com.zooweb.web.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.zooweb.business.service.user.SysUserService;
import com.zooweb.modle.dto.ResultInfo;
import com.zooweb.modle.entities.user.SysUser;
import com.zooweb.modle.entities.user.SysUserExample;
import com.zooweb.web.rabbitmq.CommonMessage;
import com.zooweb.web.rabbitmq.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value="/userRest")
public class UserController {

	@Autowired
	private MessageSender messageSender;
	@Autowired
	private SysUserService sysUserService;

	/**
	 * 方法名可以和请求方式名称一致，例如可以替换成gets
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		//测试查询数据
		SysUserExample example = new SysUserExample();
		ResultInfo resultInfo = sysUserService.getUserListData(example);
		if (resultInfo.getResultFlag()) {
			List<SysUser> list = (List<SysUser>) resultInfo.getResultObject();
			System.out.println("查询到的数据条数：" + list.size());
		} else {
			System.out.println("查询用户数据失败!");
		}
		return "index";
	}

	/**
	 * 方法名可以和请求方式名称一致，例如getUserList可以替换成get
	 * 由于控制器类使用的是@RestController注解,其中含有@ResponseBody注解,结果index没有经过视图解析器解析，
	 * 直接变成json字符串返回给浏览器了，可以改变返回类型为ModelAndView，直接返回视图
	 * @return
	 */
	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	public ModelAndView getUserList() {
		System.out.println("查询用户数量......");
		CommonMessage message = new CommonMessage();
		message.setComments("查询一下系统目前用户数量：");
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

		ModelAndView view = new ModelAndView("user/user");
		return view;
	}

	@RequestMapping(value = "/userInfoTest", method = RequestMethod.GET)
	public String getUserInfo() {
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

	@RequestMapping(value = "/userInfo/{userId}", method = RequestMethod.GET,produces = {"application/json;charset=utf-8"})
	public ResponseEntity<ResultInfo> getUserDetailInfo(@PathVariable("userId") String userId) {
		System.out.println(">>>开始获取ID为:" + userId + "的用户详细信息......");
		SysUser entity = new SysUser();
		ResultInfo resultInfo = sysUserService.getUserListByEntity(entity);
		if (!resultInfo.getResultFlag()) {
			System.out.println("User with id " + userId + " not found");
			return new ResponseEntity<ResultInfo>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<ResultInfo>(resultInfo, HttpStatus.OK);
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String addUser(@RequestBody SysUser sysUser) {
		return "";
	}

	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	public String updateUser() {
		return "";
	}

	@RequestMapping(value = "/user", method = RequestMethod.DELETE)
	public String deleteUserById() {
		return "";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), false));
	}
}