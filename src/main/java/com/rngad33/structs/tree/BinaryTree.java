package com.rngad33.structs.tree;

import com.rngad33.structs.common.TreeNode;

/**
 * 二叉树
 *
 * @param <T>
 */
public class BinaryTree<T> {

    private final TreeNode<T> root;

    public BinaryTree() {
        this.root = new TreeNode<>();
    }

    public BinaryTree(T x) {
        this.root = new TreeNode<>(x);
    }

}