package com.godfkc.controller;

import com.godfkc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wj
 * @date 13:22 2018/2/24
 * @description
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    /**
     * 多次访问 会交替显示端口（负载均衡）
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
