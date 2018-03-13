package com.godfkc.controller;

import com.godfkc.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 在controller层，对外暴露一个”/hi”的API接口，
 * 通过上面定义的Feign客户端SchedualServiceHi 来消费服务
 * @author wj
 * @date 14:18 2018/2/24
 * @description
 */
@RestController
public class hiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;
    @RequestMapping("/hi")
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
