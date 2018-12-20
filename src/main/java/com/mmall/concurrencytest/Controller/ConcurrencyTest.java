package com.mmall.concurrencytest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConcurrencyTest {

    @RequestMapping(value="/test",method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return "test";
    }
//    public static void main(String[] args) {
//
//    }
}
