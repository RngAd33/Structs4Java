package com.rngad33.structs.tree;

import com.rngad33.structs.common.TreeNode;

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
     * @param x
     */
    public BinaryTree(T x) {
        this.root = new TreeNode<>(x);
    }

}