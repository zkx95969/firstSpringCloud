package com.godfkc.controller;

import com.godfkc.Service.PersonService;
import com.godfkc.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wj
 * @date 13:57 2018/2/27
 * @description
 */
@RestController
public class PersonController {
    @Autowired
    private PersonService personService;
    @Value("${server.port}")
    private String port;

    @RequestMapping("/person/findOnePerson")
    public Person findOne(@RequestParam Long id){
        System.out.println("===============端口号为:"+port);
        Person person = personService.findOne(id);
        return person;
    }

    @RequestMapping("/person/findAll")
    public List<Person> findAll(){
        System.out.println("===============端口号为:"+port);
        return personService.findAll();
    }

    @RequestMapping("/person/findByAge")
    public List<Person> findByAge(@RequestParam Integer age){
        System.out.println("===============端口号为:"+port);
        return personService.findByAge(age);
    }
    @RequestMapping("/person/addPerson")
    public Person addNewPerson(@RequestParam String name,@RequestParam Integer age){
        System.out.println("===============端口号为:"+port);
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return personService.addNewPerson(person);
    }

    @RequestMapping("/person/updatePerson")
    public Person updatePerson(@RequestParam Long id,@RequestParam String name,@RequestParam Integer age){
        System.out.println("===============端口号为:"+port);
        Person person = personService.findOne(id);
        if(person==null){
            return null;
        }
        if(name!=null){
            person.setName(name);
        }
        if(age!=null){
            person.setAge(age);
        }
        return personService.updatePerson(person);
    }
}
