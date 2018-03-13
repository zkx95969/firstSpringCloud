package com.godfkc.service.impl;

import com.godfkc.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author wj
 * @date 14:49 2018/2/24
 * @description
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry,"+name;
    }
}
