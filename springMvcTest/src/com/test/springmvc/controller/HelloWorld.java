package com.test.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.springmvc.service.UserService;
import com.test.springmvc.serviceImpl.UserServiceImpl;
import com.test.springmvc.vo.User;


@Controller
@RequestMapping("/gu")
public class HelloWorld {

    /**
     * 1. 使用RequestMapping注解来映射请求的URL
     * 2. 返回值会通过视图解析器解析为实际的物理视图, 对于InternalResourceViewResolver视图解析器，会做如下解析
     * 通过prefix+returnVal+suffix 这样的方式得到实际的物理视图，然后会转发操作
     * "/WEB-INF/views/success.jsp"
     * @return
     */
	
	@Autowired
    UserService userService; 
	
    @RequestMapping("/helloworld")
    public ModelAndView hello(){
        //System.out.println("hello world");
        
        User user = userService.selectByPrimaryKey(1);
        
       /* MyUser myUser = new MyUser();
        myUser.setName("Gu");
        myUser.setAge(12);
        
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("myuser", myUser);*/
        
        Map<String, Object> map = new HashMap<>();
        map.put("myuser", user);
        
        
        ModelAndView modelAndView = new ModelAndView("success",map);
        
        
        return modelAndView;
    }
}