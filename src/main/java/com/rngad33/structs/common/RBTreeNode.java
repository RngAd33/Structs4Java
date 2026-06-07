package com.rngad33.structs.common;

import lombok.Data;

/**
 * 红黑树结点
 *
 * @param <T>
 */
@Data
public class RBTreeNode<T> {

    // 左孩子
    private RBTreeNode<T> lChild;

    // 数据域
    private T data;

    // 右孩子
    private RBTreeNode<T> rChild;

    // 颜色
    private int color;

    /**
     * 无参构造
     */
    public RBTreeNode() {
        this.lChild = null;
        this.data = null;
        this.rChild = null;
        this.color = Constant.RED;
    }

    /**
     * 有参构造
     *
     * @param data
     */
    public RBTreeNode(T data) {
        this.lChild = null;
        this.data = data;
        this.rChild = null;
        this.color = Constant.RED;
    }

}