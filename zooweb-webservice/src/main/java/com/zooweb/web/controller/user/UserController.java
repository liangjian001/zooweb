package com.zooweb.web.controller.user;

import com.zooweb.business.service.user.SysUserService;
import com.zooweb.modle.dto.ResultInfo;
import com.zooweb.modle.entities.user.SysUser;
import com.zooweb.modle.entities.user.SysUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value="/userRest")
public class UserController {

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

	//itemsView/{id}里边的{id}表示占位符，通过@PathVariable获取占位符中的参数，
	//@PathVariable中名称要和占位符一致，形参名无需和其一致
	//如果占位符中的名称和形参名一致，在@PathVariable可以不指定名称
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
	public ResultInfo addUser(@RequestBody SysUser sysUser) {
		ResultInfo resultInfo = new ResultInfo();
		if (null == sysUser){
			//return new ResponseEntity<ResultInfo>(HttpStatus.NOT_FOUND);
			return resultInfo;
	}
		System.out.println(">>>开始保存用户名为:" + sysUser.getUserName() + "的用户详细信息......");
		if (null == sysUser.getId() || "".equals(sysUser.getId())){
			resultInfo.setResultFlag(false);
			resultInfo.setResultText("用户ID标志不能为空...");
			//return new ResponseEntity<ResultInfo>(resultInfo,HttpStatus.NOT_FOUND);
			return resultInfo;
		}
		//sysUser.setId("qwehiuhcc=980879-97jm");
		//resultInfo = sysUserService.insertUserInfo(sysUser);
		//return new ResponseEntity<ResultInfo>(resultInfo, HttpStatus.OK);
		return resultInfo;
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