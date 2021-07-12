package com.zx.service.impl;

import com.zx.entity.dto.UmsMemberLoginParamDTO;
import com.zx.entity.dto.UmsMemberRegisterParamDTO;
import com.zx.service.UmsMemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.zx.mapper.UmsMemberMapper;
import com.zx.entity.UmsMember;


/**
 * @author： zhangxin
 * @date： 2021-07-04 13:48
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String register(UmsMemberRegisterParamDTO umsMemberRegisterParamDTO) {

        UmsMember u = new UmsMember();

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode(umsMemberRegisterParamDTO.getPassword());

        BeanUtils.copyProperties(umsMemberRegisterParamDTO, u);

        u.setPassword(encode);
        umsMemberMapper.insert(u);

        return "success";
    }

    @Override
    public String login(UmsMemberLoginParamDTO umsMemberLoginParamDTO) {

        UmsMember umsMember = umsMemberMapper.selectByName(umsMemberLoginParamDTO.getUsername());

        if(null !=  umsMember){
            String passwordDb = umsMember.getPassword();

            if(!passwordEncoder.matches(umsMemberLoginParamDTO.getPassword(),passwordDb)){
                return "密码不正确";
                // return ResultWrapper.getFailBuilder().code(StateCodeEnum.PASSWORD_ERROR.getCode()).msg(StateCodeEnum.PASSWORD_ERROR.getMsg()).build();
            }
        }else{

            return "用户不存在";
            // return ResultWrapper.getFailBuilder().code(StateCodeEnum.USER_EMPTY.getCode()).msg(StateCodeEnum.USER_EMPTY.getMsg()).build();
        }

        System.out.println("登录成功");

        return umsMember.getId().toString();
    }

}

