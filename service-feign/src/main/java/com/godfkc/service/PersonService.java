package com.godfkc.service;

import com.godfkc.service.impl.PersonServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wj
 * @date 14:22 2018/2/27
 * @description
 */
@FeignClient(value = "service-hi",fallback = PersonServiceHystrix.class)
public interface PersonService {
    @RequestMapping(value = "/person/findOnePerson",method = RequestMethod.GET)
    String findOne(@RequestParam(value = "id") Long id);
    @RequestMapping(value = "/person/findAll",method = RequestMethod.GET)
    String findAll();
    @RequestMapping(value = "/person/findByAge",method = RequestMethod.GET)
    String findByAge(@RequestParam(value = "age") Integer age);
    @RequestMapping(value = "/person/addPerson",method = RequestMethod.GET)
    String addNewPerson(@RequestParam(value = "age") Integer age,@RequestParam(value = "name") String name);
    @RequestMapping(value = "/person/updatePerson",method = RequestMethod.GET)
    String updatePerson(@RequestParam(value = "age") Integer age,@RequestParam(value = "name") String name,@RequestParam(value = "id") Long id);
}
