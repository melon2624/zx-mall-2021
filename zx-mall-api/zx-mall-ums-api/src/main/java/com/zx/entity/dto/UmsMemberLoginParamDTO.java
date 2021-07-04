package com.zx.entity.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UmsMemberLoginParamDTO {
    private String username;
    private String password;
}