package com.zx.controller;

import com.zx.entity.dto.UmsMemberLoginParamDTO;
import com.zx.entity.dto.UmsMemberRegisterParamDTO;
import com.zx.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： zhangxin
 * @date： 2021-07-04 17:13
 */
@RestController
@RequestMapping("user-member")
public class UserMemberController {


    @Autowired
    UmsMemberService umsMemberService;

    @RequestMapping("/hello")
    public String hello() {

        return "hello";
    }

    @RequestMapping("/register")
    public String register(@RequestBody UmsMemberRegisterParamDTO umsMemberRegisterParamDTO) {
        umsMemberService.register(umsMemberRegisterParamDTO);
        return "success";
    }


    @RequestMapping("/login")
    public  String  login(@RequestBody UmsMemberLoginParamDTO umsMemberLoginParamDTO){
        umsMemberService.login(umsMemberLoginParamDTO);

        return "登录成功";
    }




}
