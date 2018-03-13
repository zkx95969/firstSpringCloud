package com.godfkc.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author wj
 * @date 9:30 2018/3/6
 * @description
 */
@Entity
@Table(name = "ss_address_dict")
public class Address implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "parent_id",length = 20)
    private Long parentId;
    @Column(length = 20)
    private String name;
    @Column(name="is_city",length = 1)
    private Integer isCity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsCity() {
        return isCity;
    }

    public void setIsCity(Integer isCity) {
        this.isCity = isCity;
    }
}
