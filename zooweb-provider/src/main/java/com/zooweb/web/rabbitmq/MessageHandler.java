package com.zooweb.web.rabbitmq;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.zooweb.business.service.user.SysUserService;
import com.zooweb.modle.dto.ResultInfo;
import com.zooweb.modle.entities.user.SysUser;
import com.zooweb.modle.entities.user.SysUserExample;

/**
 * 消息处理类
 * 
 * @author Administrator
 */
public class MessageHandler {

	private Log log = LogFactory.getLog(MessageHandler.class);

	@Autowired
	private SysUserService sysUserService;

	@SuppressWarnings("unchecked")
	public void handleMessage(CommonMessage message) {
		try {
			System.out.println("消费者tmvc_c收到消息...." + message);
			if ("1".equals(message.getSource())) {
				SysUserExample example = new SysUserExample();
				ResultInfo resultInfo = sysUserService.getUserListData(example);
				if (resultInfo.getResultFlag()) {
					List<SysUser> list = (List<SysUser>) resultInfo.getResultObject();
					System.out.println("((⊙ˍ⊙)经查询,系统目前的数据条数：" + list.size());
				} else {
					System.out.println("查询用户数据失败!");
				}
			} else if ("2".equals(message.getSource())) {
				SysUser user = new SysUser();
				// user = (SysUser) message.getMessage();//这样直接转换会报格式转换错误
				user = JSONObject.parseObject(JSONObject.toJSONString(message.getMessage()), SysUser.class);
				System.out.println("开始查询用户ID为：" + user.getUserId() + "的用户信息......");
				ResultInfo resultInfo = sysUserService.getUserListByEntity(user);
				if (resultInfo.getResultFlag()) {
					List<SysUser> list = (List<SysUser>) resultInfo.getResultObject();
					SysUser userInfo = list.get(0);
					System.out.println("((⊙ˍ⊙)经查询,用户ID为：" + user.getUserId() + "的邮箱为：" + userInfo.getUserEmail());
				} else {
					System.out.println("查询指定用户数据失败!");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}