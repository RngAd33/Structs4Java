package com.rngad33.structs.tree;

import com.rngad33.structs.common.DuNode;
import com.rngad33.structs.common.TreeNode;

/**
 * B+树
 *
 * @param <T>
 */
public class BPlusTree<T> {

    private final TreeNode<T> root;

    private final DuNode<T> finalNode;

    /**
     * 初始化
     */
    public BPlusTree() {
        this.root = new TreeNode<>();
        this.finalNode = new DuNode<>(null,  null);
    }

}