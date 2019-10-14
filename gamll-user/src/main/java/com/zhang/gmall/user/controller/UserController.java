/**
 * 描述：
 *
 * @author zhangshupeng
 * @crate 2019-10-13 17:10
 */
package com.zhang.gmall.user.controller;

import com.zhang.gmall.user.bean.UmsMember;
import com.zhang.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
       List<UmsMember> umsNumber = userService.getAllUser();
       return umsNumber;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello springboot";
    }
}
