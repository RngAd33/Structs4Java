package com.rngad33.structs.list;

import com.rngad33.structs.common.DuNode;

/**
 * 双向链表
 *
 * @param <T>
 */
public class DoubleLinkedList<T> {

    private final DuNode<T> head;

    private int length;

    public DoubleLinkedList(DuNode<T> head) {
        this.head = new DuNode<>(null, null);
        this.length = 0;
    }



}