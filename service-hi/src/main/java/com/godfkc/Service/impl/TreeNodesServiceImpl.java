package com.godfkc.Service.impl;

import com.godfkc.Service.TreeNodesService;
import com.godfkc.entity.TreeNodes;
import com.godfkc.repository.TreeNodesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wj
 * @date 9:56 2018/3/5
 * @description
 */
@Service
public class TreeNodesServiceImpl implements TreeNodesService{
    @Autowired
    private TreeNodesRepository treeNodesRepository;

    @Override
    public TreeNodes selectById(Long id) {
        return treeNodesRepository.findOne(id);
    }
}
