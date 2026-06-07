package com.rngad33.structs.list;

import com.rngad33.structs.common.Node;

/**
 * 单链表
 *
 * @param <T>
 */
public class LinkedList<T> {

    private final Node<T> head;

    private int length;

    /**
     * 初始化单链表
     */
    public LinkedList() {
        this.head = new Node<>(null);
        this.length = 0;
    }

    /**
     * 插入数据（头插）
     *
     * @param data
     */
    public void insertHead(T data) {
        Node<T> p = head;
        Node<T> q = p.getNext();
        Node<T> r = new Node<>(data, p.getNext());

        p.setNext(r);
        r.setNext(q);
        length++;
    }

    /**
     * 插入数据（尾插）
     *
     * @param data
     */
    public void insertTail(T data) {
        Node<T> p = head;
        Node<T> q = p.getNext();
        Node<T> r = new Node<>(data, null);

        // 前往尾结点
        while (q != null) {
            p = q;
            q = q.getNext();
        }

        p.setNext(r);
        length++;
    }

    /**
     * 插入数据（指定位置）
     *
     * @param data
     * @param index
     */
    public boolean insert(T data, int index) {
        if (!this.checkIndex(index)) return false;

        Node<T> p = head;
        Node<T> q = p.getNext();
        Node<T> r = new Node<>(data, null);

        int i = 1;
        while (index > i) {
            p = q;
            q = q.getNext();
            i++;
        }

        p.setNext(r);
        r.setNext(q);
        length++;
        return true;
    }

    /**
     * 遍历所有元素
     *
     * @return
     */
    public T[] queryAll() {
        Node<T> p = head;
        Node<T> q = p.getNext();

        T[] dataList = (T[]) new Object[length];
        for (int i = 0; i < length; i++) {
            dataList[i] = q.getData();
            p = q;
            q = q.getNext();
        }
        return dataList;
    }

    /**
     * 查询指定位置的元素
     *
     * @param index
     * @return
     */
    public T query(int index) {
        Node<T> q = this.getTargetNode(index);
        if (q == null) return null;

        return q.getData();
    }

    /**
     * 删除指定位置的数据
     *
     * @param index
     * @return
     */
    public T remove(int index) {
        if (!this.checkIndex(index)) return null;

        Node<T> p = head;
        Node<T> q = p.getNext();

        // 前往指定结点
        int i = 1;
        while (index > i) {
            p = q;
            q = q.getNext();
            i++;
        }

        p.setNext(q.getNext());
        length--;
        return q.getData();
    }

    /**
     * 更新指定位置的元素
     *
     * @param index
     * @param data
     */
    public boolean update(int index, T data) {
        Node<T> q = this.getTargetNode(index);
        if (q == null) return false;

        q.setData(data);
        return true;
    }

    /**
     * 检查位置是否合法
     *
     * @param index
     * @return
     */
    private boolean checkIndex(int index) {
        return index > 0 && length > 0 && index <= length;
    }

    /**
     * 检查位置是否合法
     *
     * @param index
     * @return
     */
    private Node<T> getTargetNode(int index) {
        if (this.checkIndex(index)) return null;

        Node<T> p = head;
        Node<T> q = p.getNext();

        // 前往指定结点
        int i = 1;
        while (index > i) {
            p = q;
            q = q.getNext();
            i++;
        }

        return q;
    }

}