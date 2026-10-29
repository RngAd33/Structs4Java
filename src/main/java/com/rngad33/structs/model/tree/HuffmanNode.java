package com.rngad33.structs.model.tree;

import lombok.Data;

/**
 * 哈夫曼树节点
 *
 * @param <T>
 */
@Data
public class HuffmanNode<T> {

    /**
     * 数据域
     */
    private T data;

    /**
     * 权重
     */
    private double weight;

    private int parent;

    private int lChild;

    private int rChild;

}