package com.rngad33.structs.common;

import lombok.Data;

/**
 * 双向链表结点
 *
 * @param <T>
 */
@Data
public class DuNode<T> {

    /**
     * 前驱结点
     */
    private DuNode<T> prior;

    /**
     * 当前结点数据
     */
    private T data;

    /**
     * 后继结点
     */
    private DuNode<T> next;

    /**
     * 有参构造
     *
     * @param prior
     * @param next
     */
    public DuNode(DuNode<T> prior, DuNode<T> next) {
        this.prior = prior;
        this.next = next;
    }

    /**
     * 全参构造
     *
     * @param prior
     * @param data
     * @param next
     */
    public DuNode(DuNode<T> prior, T data, DuNode<T> next) {
        this.prior = prior;
        this.data = data;
        this.next = next;
    }

}