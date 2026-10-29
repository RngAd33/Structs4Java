package com.rngad33.structs.tree;

import com.rngad33.structs.model.tree.BinaryTreeNode;

/**
 * 二叉树（链式存储）
 *
 * @param <T>
 */
public class LinkedBinaryTree<T> implements Tree<T> {

    // 树根
    private final BinaryTreeNode<T> root;

    /**
     * 初始化（无参）
     */
    public LinkedBinaryTree() {
        this.root = new BinaryTreeNode<>();
    }

    /**
     * 初始化（有参）
     *
     * @param data
     */
    public LinkedBinaryTree(T data) {
        this.root = new BinaryTreeNode<>(data);
    }

    /**
     * 插入左子树
     *
     * @param data
     * @param parent
     */
    @Override
    public void insertLeft(T data, BinaryTreeNode<T> parent) {
        if (parent == null) return;

        BinaryTreeNode<T> p = new BinaryTreeNode<>(data);
        if (parent.getLChild() != null) {
            p.setLChild(parent.getLChild());
        } else {
            parent.setLChild(p);
        }
    }

    /**
     * 插入右子树
     *
     * @param data
     * @param parent
     */
    @Override
    public void insertRight(T data, BinaryTreeNode<T> parent) {
        if (parent == null) return;

        BinaryTreeNode<T> p = new BinaryTreeNode<>(data);
        if (parent.getRChild() != null) {
            p.setRChild(parent.getRChild());
        } else {
            parent.setRChild(p);
        }
    }

    /**
     * 删除左子树
     *
     * @param parent
     * @return
     */
    @Override
    public T removeLeft(BinaryTreeNode<T> parent) {
        if (parent == null) return null;

        T data = parent.getLChild().getData();
        parent.setLChild(null);
        return data;
    }

    /**
     * 删除右子树
     *
     * @param parent
     * @return
     */
    @Override
    public T removeRight(BinaryTreeNode<T> parent) {
        if (parent == null) return null;

        T data = parent.getRChild().getData();
        parent.setRChild(null);
        return data;
    }

    /**
     * 先序遍历
     *
     * @return
     */
    @Override
    public void preOrder(BinaryTreeNode<T> node) {
        if (node == null) return;

        visit(node.getData());
        preOrder(node.getLChild());
        preOrder(node.getRChild());
    }

    /**
     * 中序遍历
     *
     * @return
     */
    @Override
    public void inOrder(BinaryTreeNode<T> node) {
        if (node == null) return;

        preOrder(node.getLChild());
        visit(node.getData());
        preOrder(node.getRChild());
    }

    /**
     * 后序遍历
     *
     * @param node
     */
    @Override
    public void postOrder(BinaryTreeNode<T> node) {
        if (node == null) return;

        preOrder(node.getLChild());
        preOrder(node.getRChild());
        visit(node.getData());
    }

    /**
     * 获取树高
     *
     * @param parent
     * @return
     */
    @Override
    public int getHeight(BinaryTreeNode<T> parent) {
        return 1;
    }

    /**
     * 访问根结点
     *
     * @param data
     */
    private void visit(T data) {
        System.out.print(data + " ");
    }

}