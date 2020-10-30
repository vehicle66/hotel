package com.hotel.controller;

import com.hotel.entities.CommonResult;
import com.hotel.entities.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: cb
 * @Date: 2020/10/30 16:14
 * @Version 1.0
 */
@Controller
public class TestController {
    @ResponseBody
    @RequestMapping("test")
    public String test(){
        
        return "this is test";
    }
    
    
}
