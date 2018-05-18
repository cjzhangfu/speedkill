package com.ifeng.speedkill.controller;

import com.ifeng.speedkill.uitl.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class Hello {
    @RequestMapping("/demo")
    @ResponseBody
    public  Result<String> hello(){
      return Result.success("hello,imooc");
    }
    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("name","zhangfu");
        return "hello";
    }
}
