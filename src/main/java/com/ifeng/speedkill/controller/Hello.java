package com.ifeng.speedkill.controller;

import com.ifeng.speedkill.domain.User;
import com.ifeng.speedkill.redis.RedisService;
import com.ifeng.speedkill.service.UserService;
import com.ifeng.speedkill.uitl.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class Hello {
    @Autowired
    UserService userService;
    @Autowired
    RedisService redisService;

    @RequestMapping("/demo")
    @ResponseBody
    public Result<String> hello() {
        return Result.success("hello,imooc");
    }

    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("name", "zhangfu");
        return "hello";
    }

    @RequestMapping("/doget")
    @ResponseBody
    public Result<User> dbGet() {
        User user = userService.getById(1);
        return Result.success(user);
    }

    @RequestMapping("/redis/get")
    @ResponseBody
    public Result<Long> redisGet() {
        Long v1 = redisService.get("key1", Long.class);
        return Result.success(v1);
    }

    @RequestMapping("/redis/set")
    @ResponseBody
    public Result<Boolean> redisSet() {
        Boolean v1 = redisService.set("key2", "hello zf!");
        return Result.success(v1);
    }
}
