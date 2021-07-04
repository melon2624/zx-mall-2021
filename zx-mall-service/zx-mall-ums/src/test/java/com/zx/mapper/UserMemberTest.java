package com.zx.mapper;

import com.zx.entity.UmsMember;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author： zhangxin
 * @date： 2021-07-04 03:01
 */
@SpringBootTest
public class UserMemberTest {

    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Test
    public  void  test(){

        UmsMember t=new UmsMember();
        t.setUsername("cpf4");
        t.setStatus(0);
        t.setPassword("1");
        t.setNote("note");
        t.setNickName("nick");
        t.setEmail("email");

        umsMemberMapper.insert(t);
    }
}
