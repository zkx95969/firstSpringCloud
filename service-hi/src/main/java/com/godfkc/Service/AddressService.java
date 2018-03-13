package com.godfkc.Service;

import com.godfkc.entity.Address;

import java.util.List;

/**
 * @author wj
 * @date 9:58 2018/3/6
 * @description
 */
public interface AddressService {
    List<Address> findByParentId(Long parentId);
}
