package com.xr.sys.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/sys")
public class IndexController {

    @GetMapping("/say")
    public String say(@RequestParam String name) {
        return "Hello, " + name + " " + new Date();
    }

}
