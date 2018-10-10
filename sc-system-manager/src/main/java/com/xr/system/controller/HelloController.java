package com.xr.system.controller;


import com.xr.system.remote.DomeRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @Autowired
    DomeRemote domeRemote;

    @GetMapping("/{name}")
    public String index(@PathVariable("name") String name) {
        return domeRemote.say(name+"!");
    }
}
