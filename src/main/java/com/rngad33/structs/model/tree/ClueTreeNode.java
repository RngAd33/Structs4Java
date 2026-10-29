package com.rngad33.structs.model.tree;

import lombok.Data;

/**
 * 线索二叉树结点
 *
 * @param <T>
 */
@Data
public class ClueTreeNode<T> {

    /**
     * 数据域
     */
    private T data;

    /**
     * 左孩子
     */
    private ClueTreeNode<T> lChild;

    /**
     * 右孩子
     */
    private ClueTreeNode<T> rChild;

    /**
     * 左线索
     */
    private ClueTreeNode<T> lTag;

    /**
     * 右线索
     */
    private ClueTreeNode<T> rTag;

}