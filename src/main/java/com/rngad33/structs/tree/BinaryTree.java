package com.rngad33.structs.tree;

import com.rngad33.structs.common.TreeNode;
import com.rngad33.structs.list.ArrayList;
import com.rngad33.structs.list.List;

/**
 * 二叉树
 *
 * @param <T>
 */
public class BinaryTree<T> {

    private final TreeNode<T> root;

    /**
     * 初始化（无参）
     */
    public BinaryTree() {
        this.root = new TreeNode<>();
    }

    /**
     * 初始化（有参）
     *
     * @param data
     */
    public BinaryTree(T data) {
        this.root = new TreeNode<>(data);
    }

    /**
     * 插入左子树
     *
     * @param data
     * @param parent
     */
    public void insertLeft(T data, TreeNode<T> parent) {
        if (parent == null) return;

        TreeNode<T> p = new TreeNode<>(data);
        if (parent.getLChild() != null) {
            p.setLChild(parent.getLChild());
        }
        parent.setLChild(p);
    }

    /**
     * 插入右子树
     *
     * @param data
     * @param parent
     */
    public void insertRight(T data, TreeNode<T> parent) {
        if (parent == null) return;

        TreeNode<T> p = new TreeNode<>(data);
        if (parent.getRChild() != null) {
            p.setRChild(parent.getRChild());
        }
        parent.setRChild(p);
    }

    /**
     * 删除左子树
     *
     * @param parent
     * @return
     */
    public T removeLeft(TreeNode<T> parent) {
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
    public T removeRight(TreeNode<T> parent) {
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
    public void preOrder(TreeNode<T> node) {
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
    public void inOrder(TreeNode<T> node) {
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
    public void postOrder(TreeNode<T> node) {
        if (node == null) return;

        preOrder(node.getLChild());
        preOrder(node.getRChild());
        visit(node.getData());
    }

    /**
     * 访问结点数据
     *
     * @param data
     */
    private void visit(T data) {
        System.out.println(data);
    }

}