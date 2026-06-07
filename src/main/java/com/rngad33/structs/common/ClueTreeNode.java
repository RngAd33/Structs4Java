package com.rngad33.structs.common;

import lombok.Data;

/**
 * 线索树结点
 *
 * @param <T>
 */
@Data
public class ClueTreeNode<T> {

    private ClueTreeNode<T> lChild;

    private T data;

    private ClueTreeNode<T> rChild;

    private ClueTreeNode<T> lTag;

    private ClueTreeNode<T> rTag;

}