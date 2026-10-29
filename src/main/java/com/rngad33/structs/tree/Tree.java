package com.rngad33.structs.tree;

import com.rngad33.structs.model.tree.BinaryTreeNode;

/**
 * 树
 */
public interface Tree<T> {

    /**
     * 插入左子树
     *
     * @param data   数据
     * @param parent 父节点
     */
    void insertLeft(T data, BinaryTreeNode<T> parent);

    /**
     * 插入右子树
     *
     * @param data   数据
     * @param parent 父节点
     */
    void insertRight(T data, BinaryTreeNode<T> parent);

    /**
     * 删除左子树
     *
     * @param parent 父节点
     * @return 被删除节点的数据
     */
    T removeLeft(BinaryTreeNode<T> parent);

    /**
     * 删除右子树
     *
     * @param parent 父节点
     * @return 被删除节点的数据
     */
    T removeRight(BinaryTreeNode<T> parent);

    /**
     * 先序遍历
     *
     * @param node 起始节点
     */
    void preOrder(BinaryTreeNode<T> node);

    /**
     * 中序遍历
     *
     * @param node 起始节点
     */
    void inOrder(BinaryTreeNode<T> node);

    /**
     * 后序遍历
     *
     * @param node 起始节点
     */
    void postOrder(BinaryTreeNode<T> node);

    /**
     * 获取树高
     *
     * @param parent 父节点
     * @return 树的高度
     */
    int getHeight(BinaryTreeNode<T> parent);

}