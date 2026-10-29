package com.rngad33.structs.tree;

import com.rngad33.structs.model.tree.BinaryTreeNode;

/**
 * 二叉树（顺序存储）
 *
 * @param <T>
 */
public class ArrayBinaryTree<T> implements Tree<T> {

    private T[] datas;

    public int length;   // 节点总总数

    public ArrayBinaryTree() {
        this.datas = (T[]) new Object[100];
        this.length = 0;
    }

    /**
     * 插入左子树
     *
     * @param data
     * @param parent
     */
    @Override
    public void insertLeft(T data, BinaryTreeNode<T> parent) {

    }

    /**
     * 插入右子树
     *
     * @param data   数据
     * @param parent 父节点
     */
    @Override
    public void insertRight(T data, BinaryTreeNode<T> parent) {

    }

    /**
     * 删除左子树
     *
     * @param parent 父节点
     * @return
     */
    @Override
    public T removeLeft(BinaryTreeNode<T> parent) {
        return null;
    }

    /**
     * 删除右子树
     *
     * @param parent 父节点
     * @return
     */
    @Override
    public T removeRight(BinaryTreeNode<T> parent) {
        return null;
    }

    /**
     * 先序遍历
     *
     * @param node 起始节点
     */
    @Override
    public void preOrder(BinaryTreeNode<T> node) {

    }

    /**
     * 中序遍历
     *
     * @param node 起始节点
     */
    @Override
    public void inOrder(BinaryTreeNode<T> node) {

    }

    /**
     * 后序遍历
     *
     * @param node 起始节点
     */
    @Override
    public void postOrder(BinaryTreeNode<T> node) {

    }

    /**
     * 获取树的高度
     *
     * @param parent 父节点
     * @return
     */
    @Override
    public int getHeight(BinaryTreeNode<T> parent) {
        return 0;
    }

}