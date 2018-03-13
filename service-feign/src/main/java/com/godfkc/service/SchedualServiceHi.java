package com.godfkc.service;

/**
 * @author wj
 * @date 13:49 2018/2/24
 * @description
 */

import com.godfkc.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 定义一个feign接口，通过@ FeignClient（“服务名”），
 * 来指定调用哪个服务。比如在代码中调用了service-hi服务的“/hi”接口
 */

/**
 * 熔断器:基于service-feign工程进行改造，
 * 只需要在FeignClient的SchedualServiceHi接口的注解中加上fallback的指定类就行了
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
