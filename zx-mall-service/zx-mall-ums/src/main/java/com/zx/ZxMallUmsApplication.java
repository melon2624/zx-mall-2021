package com.zx;

import com.zx.entity.UmsMember;
import com.zx.mapper.UmsMemberMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zx.mapper")
public class ZxMallUmsApplication {



    public static void main(String[] args) {
        SpringApplication.run(ZxMallUmsApplication.class, args);

    }

}
