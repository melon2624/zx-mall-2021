package com.zx.controller;

import com.zx.util.SliderUtil;
import com.zx.util.VerificationVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author： zhangxin
 * @date： 2021-07-12 23:45
 */
@RestController
@RequestMapping("/my-slider")
public class MySliderController {

    @GetMapping("/generator")
    public VerificationVO generatorCode(HttpServletRequest request, HttpServletResponse response) {

        return SliderUtil.cut();
    }
}
