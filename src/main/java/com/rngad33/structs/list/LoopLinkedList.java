package com.rngad33.structs.list;

import com.rngad33.structs.common.Node;

/**
 * 循环链表
 */
public class LoopLinkedList<T> {

    private final Node<T> head;

    private int length;

    /**
     * 初始化循环链表
     */
    public LoopLinkedList() {
        this.head = new Node<>(null);
        this.length = 0;
    }

}