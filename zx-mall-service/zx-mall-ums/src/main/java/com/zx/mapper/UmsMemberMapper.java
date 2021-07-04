package com.zx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zx.entity.UmsMember;
import com.zx.entity.UmsMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author： zhangxin
 * @date： 2021-07-04 13:50
 */
@Mapper
public interface UmsMemberMapper extends BaseMapper<UmsMember> {
    UmsMember selectByName(String name);
}