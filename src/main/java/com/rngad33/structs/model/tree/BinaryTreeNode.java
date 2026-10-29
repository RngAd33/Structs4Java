package com.rngad33.structs.model.tree;

import lombok.Data;

/**
 * 二叉树结点
 *
 * @param <T>
 */
@Data
public class BinaryTreeNode<T> {

    // 左孩子
    private BinaryTreeNode<T> lChild;

    // 数据域
    private T data;

    // 右孩子
    private BinaryTreeNode<T> rChild;

    /**
     * 无参构造
     */
    public BinaryTreeNode() {
        this.lChild = null;
        this.data = null;
        this.rChild = null;
    }

    /**
     * 有参构造
     *
     * @param data
     */
    public BinaryTreeNode(T data) {
        this.lChild = null;
        this.data = data;
        this.rChild = null;
    }

}