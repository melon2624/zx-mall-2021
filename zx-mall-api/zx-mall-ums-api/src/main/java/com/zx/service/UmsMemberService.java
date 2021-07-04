package com.zx.service;

import com.zx.entity.dto.UmsMemberLoginParamDTO;
import com.zx.entity.dto.UmsMemberRegisterParamDTO;

/**
 * @author： zhangxin
 * @date： 2021-07-04 13:48
 */
public interface UmsMemberService  {

    public String register(UmsMemberRegisterParamDTO umsMemberRegisterParamDTO);

    String login(UmsMemberLoginParamDTO umsMemberLoginParamDTO);
}

