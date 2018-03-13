package com.godfkc.controller;

import com.godfkc.Service.AddressService;
import com.godfkc.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wj
 * @date 10:01 2018/3/6
 * @description
 */
@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    @RequestMapping("/findAddressCounts/{id}")
    public List<Address> getTotalCounts(@PathVariable("id")Long id){
        return addressService.findByParentId(id);
        /*List<Address> list = addressService.findByParentId(id);
        if(list==null||list.size()==0){
            return null;
        }else{
            List<Long> ids = new ArrayList<>();
            for(Address address : list){
                ids.add(address.getId());
            }
            return ids;
        }*/
    }

    private Long getAddressTotalCounts(Long id) {
        Long totalCounts = 0L;
        List<Address> addressList = addressService.findByParentId(id);
        if(addressList!=null&&addressList.size()>0){
            totalCounts += addressList.size();
            for (Address address:addressList){
                totalCounts += getAddressTotalCounts(address.getId());
            }
        }
        return totalCounts;
    }
}
