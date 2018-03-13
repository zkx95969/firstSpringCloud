package com.godfkc.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @author wj
 * @date 13:29 2018/2/27
 * @description
 */
@Entity
@Table(name = "ss_person")
public class Person implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "pName",length = 20)
    private String name;
    @Column(name = "pAge",length = 10)
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
