package com.godfkc.repository;

import com.godfkc.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wj
 * @date 13:54 2018/2/27
 * @description
 */
public interface PersonRepository extends JpaRepository<Person,Long>{
    List<Person> findByAge(Integer age);
}
