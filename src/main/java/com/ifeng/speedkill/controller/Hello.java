package com.ifeng.speedkill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class Hello {
    @RequestMapping("/demo")
    public  String hello(Model model){
        model.addAttribute("zhangfu","zhangfu");
        return "hello";
    }
}
