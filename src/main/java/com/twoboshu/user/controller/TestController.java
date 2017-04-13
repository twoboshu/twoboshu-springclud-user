package com.twoboshu.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lilin
 * @version 2017/4/13 下午4:53
 */
@RestController
public class TestController {
    @RequestMapping("hello")
    public String index(){
        return "hello world";
    }
}
