package com.rngad33.structs.common;

import lombok.Data;

/**
 * 单向链表结点
 *
 * @param <T>
 */
@Data
public class Node<T> {

    /**
     * 当前结点数据
     */
    private T data;

    /**
     * 后继结点
     */
    private Node<T> next;

    /**
     * 有参构造
     *
     * @param next
     */
    public Node(Node<T> next) {
        this.next = next;
    }

    /**
     * 全参构造
     *
     * @param data
     * @param next
     */
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

}