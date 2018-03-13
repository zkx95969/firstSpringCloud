package com.godfkc.Service;

import com.godfkc.entity.Person;

import java.util.List;

/**
 * @author wj
 * @date 13:56 2018/2/27
 * @description
 */
public interface PersonService {
    Person findOne(Long id);
    List<Person> findAll();
    List<Person> findByAge(Integer age);
    Person addNewPerson(Person person);
    Person updatePerson(Person person);
}
