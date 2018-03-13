package com.godfkc.service.impl;

import com.godfkc.service.PersonService;
import org.springframework.stereotype.Component;

/**
 * @author wj
 * @date 14:23 2018/2/27
 * @description
 */
@Component
public class PersonServiceHystrix implements PersonService{
    @Override
    public String findOne(Long id) {
        return null;
    }

    @Override
    public String findAll() {
        return null;
    }

    @Override
    public String findByAge(Integer age) {
        return null;
    }

    @Override
    public String addNewPerson(Integer age, String name) {
        return null;
    }

    @Override
    public String updatePerson(Integer age, String name, Long id) {
        return null;
    }
}
