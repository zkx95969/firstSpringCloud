package com.godfkc.Service.impl;

import com.godfkc.Service.PersonService;
import com.godfkc.entity.Person;
import com.godfkc.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wj
 * @date 13:56 2018/2/27
 * @description
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person findOne(Long id) {
        return personRepository.findOne(id);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public List<Person> findByAge(Integer age) {
        return personRepository.findByAge(age);
    }

    @Override
    public Person addNewPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person updatePerson(Person person) {
        return personRepository.save(person);
    }
}
