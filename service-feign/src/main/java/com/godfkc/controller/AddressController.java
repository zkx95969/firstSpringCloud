package com.godfkc.controller;

import com.alibaba.fastjson.JSONArray;
import com.godfkc.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author wj
 * @date 10:11 2018/3/6
 * @description
 */
@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;
    @RequestMapping("/address/getCounts/{id}")
    public Long getTotalCounts(@PathVariable("id") Long id){
        return getAddressCounts(id);
    }

    private Long getAddressCounts(Long id) {
        Long totalCounts = 0L;
        String listJson = addressService.getAddressTotalCounts(id);
        if(listJson==null){
            return 0L;
        }
        List<Map> ids = JSONArray.parseArray(listJson, Map.class);
        if(ids.size()>0){
            totalCounts += ids.size();
            for(Map map : ids){
                totalCounts += getAddressCounts(Long.parseLong(map.get("id").toString()));
            }
        }
        return totalCounts;
    }
}
