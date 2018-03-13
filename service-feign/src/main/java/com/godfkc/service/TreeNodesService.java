package com.godfkc.service;

import com.godfkc.service.impl.TreeNodesServiceHytrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wj
 * @date 10:21 2018/3/5
 * @description
 */
@FeignClient(value = "service-hi",fallback = TreeNodesServiceHytrix.class)
public interface TreeNodesService {
    @RequestMapping(value = "/tree/findTree/{id}")
    String findTreeById(@PathVariable("id") Integer id);
}
