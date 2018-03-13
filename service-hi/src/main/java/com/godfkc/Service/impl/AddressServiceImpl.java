package com.godfkc.Service.impl;

import com.godfkc.Service.AddressService;
import com.godfkc.entity.Address;
import com.godfkc.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wj
 * @date 9:59 2018/3/6
 * @description
 */
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;
    @Override
    public List<Address> findByParentId(Long parentId) {
        return addressRepository.findByParentId(parentId);
    }
}
