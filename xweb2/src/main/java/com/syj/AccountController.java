package com.syj;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syj.Constants;

@Controller
public class AccountController {

	@RequestMapping(value="/test")
	@ResponseBody
	public Map withdraw( HttpServletRequest request){
//		long usersn = ((Long) request.getSession().getAttribute("usersn")).longValue();
//		System.out.println("withdraw,usersn:" + usersn);
//		//检查支付密码
//		PersonalInfo info = userService.findPersonalInfo(usersn);
//		if ("".equals(info.getTranpassword())){
//			return "5";//交易密码未设置
//		}
//		if (!tranpassword.equals(info.getTranpassword())){
//			return "6";//交易密码错误
//		}
//		String ret = "1";
		Map ret = new HashMap();
		ret.put("aaa", 123);
		
		return ret;
	}
	
}
