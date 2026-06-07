package com.rngad33.structs.list;

/**
 * 线性表
 *
 * @param <T>
 */
public interface List<T> {

    void insertHead(T data);

    void insertTail(T data);

    boolean insert(T data, int index);

    T query(int index);

    T[] queryAll();

    T remove(int index);

    void update(T data, int index);

    void clear();

}