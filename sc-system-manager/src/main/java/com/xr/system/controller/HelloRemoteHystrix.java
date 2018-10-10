package com.xr.system.controller;


import com.xr.system.remote.DomeRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 创建 HelloRemoteHystrix 类实现 DomeRemote 中实现回调的方法
 */
@Component
public class HelloRemoteHystrix implements DomeRemote {


    @Override
    public String say(@RequestParam(value = "name") String name) {
        return "Hello World!";
    }

}
