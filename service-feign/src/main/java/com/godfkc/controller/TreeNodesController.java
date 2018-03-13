package com.godfkc.controller;

import com.godfkc.service.TreeNodesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wj
 * @date 10:21 2018/3/5
 * @description
 */
@RestController
public class TreeNodesController {
    @Autowired
    private TreeNodesService treeNodesService;
    @RequestMapping("/tree/{id}")
    public String findTree(@PathVariable("id")Integer id){
        return treeNodesService.findTreeById(id);
    }
}
