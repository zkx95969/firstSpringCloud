package com.godfkc.controller;

import com.godfkc.Service.TreeNodesService;
import com.godfkc.entity.TreeNodes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author wj
 * @date 9:55 2018/3/5
 * @description
 */
@RestController
@RequestMapping("/tree")
public class TreeNodesController {
    @Autowired
    private TreeNodesService treeNodesService;
    @RequestMapping("/findTree/{id}")
    public Integer selectByIdTree(@PathVariable("id")Long id){
        Integer counts = 0;
        TreeNodes treeNodes = treeNodesService.selectById(id);
        if(treeNodes!=null){
            counts = totalCounts(treeNodes);
        }
        return counts;
    }

    /**
     * 递归查询
     * @param treeNodes
     * @return
     */
    private Integer totalCounts(TreeNodes treeNodes) {
        //初始化记录数
        Integer counts = 0;
        //初始化集合
        Set<TreeNodes> nodes = null;
        //不为空的时候取得集合
        if(treeNodes!=null){
            nodes = treeNodes.getChildren();
        }
        if(nodes!=null){
            counts+=nodes.size();
            //遍历集合
            for(TreeNodes tree :nodes){
                //递归调用
                counts+=totalCounts(tree);
            }
        }else{
            return 0;
        }
        return counts;
    }
}
