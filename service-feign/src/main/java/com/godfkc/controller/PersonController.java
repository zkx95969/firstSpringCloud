package com.godfkc.controller;

import com.godfkc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wj
 * @date 14:35 2018/2/27
 * @description
 */
@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/person/findOne")
    public String findOne(@RequestParam Long id){
        return personService.findOne(id);
    }
    @RequestMapping("/person/findAll")
    public String findAll(){
        return personService.findAll();
    }
    @RequestMapping("/person/findByAge")
    public String findByAge(@RequestParam Integer age){
        return personService.findByAge(age);
    }
    @RequestMapping("/person/addPerson")
    public String addPerson(@RequestParam Integer age,@RequestParam String name){
        return personService.addNewPerson(age,name);
    }
    @RequestMapping("/person/updatePerson")
    public String updatePerson(@RequestParam String name,@RequestParam Long id,@RequestParam Integer age){
        return personService.updatePerson(age,name,id);
    }
}
