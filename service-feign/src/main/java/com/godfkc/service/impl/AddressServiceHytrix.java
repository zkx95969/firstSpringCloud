package com.godfkc.service.impl;

import com.godfkc.service.AddressService;
import org.springframework.stereotype.Component;

/**
 * @author wj
 * @date 10:13 2018/3/6
 * @description
 */
@Component
public class AddressServiceHytrix implements AddressService{
    @Override
    public String getAddressTotalCounts(Long id) {
        return "fallback";
    }
}
