package com.rngad33.structs.tree;

import com.rngad33.structs.model.list_stack_mq.DuNode;
import com.rngad33.structs.model.tree.BinaryTreeNode;

/**
 * B+树
 *
 * @param <T>
 */
public class BPlusTree<T> {

    private final BinaryTreeNode<T> root;

    private final DuNode<T> finalNode;

    /**
     * 初始化
     */
    public BPlusTree() {
        this.root = new BinaryTreeNode<>();
        this.finalNode = new DuNode<>(null,  null);
    }

}