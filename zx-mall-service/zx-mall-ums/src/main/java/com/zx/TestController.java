package com.zx;

import com.zx.entity.UmsMember;
import com.zx.mapper.UmsMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： zhangxin
 * @date： 2021-07-04 14:14
 */
@RestController("")
public class TestController {


    @Autowired
    UmsMemberMapper umsMemberMapper;

    @RequestMapping("/zx")
    public  void test(){
        UmsMember t=new UmsMember();
        t.setUsername("cpf2");
        t.setStatus(0);
        t.setPassword("1");
        t.setNote("note");
        t.setNickName("nick");
        t.setEmail("email");

        umsMemberMapper.insert(t);
    }
}
