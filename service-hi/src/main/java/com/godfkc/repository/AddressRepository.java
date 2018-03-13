package com.godfkc.repository;

import com.godfkc.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wj
 * @date 9:55 2018/3/6
 * @description
 */
public interface AddressRepository extends JpaRepository<Address,Long>{
    List<Address> findByParentId(Long parentId);
}