package com.rngad33.structs.common;

/**
 * 二叉树结点
 *
 * @param <T>
 */
public class TreeNode<T> {

    // 左孩子
    private Node<T> lChild;

    // 数据域
    private T data;

    // 右孩子
    private Node<T> rChild;

    /**
     * 无参构造
     */
    public TreeNode() {
        this.lChild = null;
        this.data = null;
        this.rChild = null;
    }

    /**
     * 有参构造
     *
     * @param data
     */
    public TreeNode(T data) {
        this.lChild = null;
        this.data = data;
        this.rChild = null;
    }

}