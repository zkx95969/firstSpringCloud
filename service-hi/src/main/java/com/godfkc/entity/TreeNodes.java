package com.godfkc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author wj
 * @date 9:36 2018/3/5
 * @description
 */
@Entity
@Table(name = "treenodes")
public class TreeNodes implements Serializable{
        @Id
        @GeneratedValue
        private Long id;

        /**
         * 组织名称
         */
        @Column(length = 64)
        private String name;
        /**
         * 父组织
         */
        @ManyToOne
        @JoinColumn(name = "parent_id")
        private TreeNodes parent;

        /**
         * 子组织
         */
        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        @JoinColumn(name = "parent_id")
        private Set<TreeNodes> children = new HashSet<>();

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public TreeNodes getParent() {
            return parent;
        }

        public void setParent(TreeNodes parent) {
            this.parent = parent;
        }

        public Set<TreeNodes> getChildren() {
            return children;
        }

        public void setChildren(Set<TreeNodes> children) {
            this.children = children;
        }

}
