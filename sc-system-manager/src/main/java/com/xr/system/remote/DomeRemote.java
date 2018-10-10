package com.xr.system.remote;


import com.xr.system.controller.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 用于去掉编码是的错误提示
@Component
//在 DomeRemote 类添加指定 fallback 类，在服务熔断的时候返回 fallback 类中的内容。
@FeignClient(name = "sc-service-sys", fallback = HelloRemoteHystrix.class)
public interface DomeRemote {

    @GetMapping("/sys/say/")
    String say(@RequestParam(value = "name") String name);


}
