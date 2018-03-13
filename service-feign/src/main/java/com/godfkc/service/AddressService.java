package com.godfkc.service;

import com.godfkc.service.impl.AddressServiceHytrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wj
 * @date 10:12 2018/3/6
 * @description
 */
@FeignClient(value = "service-hi",fallback = AddressServiceHytrix.class)
public interface AddressService {
    /**
     * 按parentId=id查询地址集合
     * @param id  地址id
     * @return 地址集合json
     */
    @RequestMapping(value = "/findAddressCounts/{id}")
    String getAddressTotalCounts(@PathVariable("id") Long id);
}
