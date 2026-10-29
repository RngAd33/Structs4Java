package com.rngad33.structs.stack_mq;

/**
 * 队列
 *
 * @param <T>
 */
public interface Mq<T> {

    void push(T data);

    T pop();

    T[] queryAll();

    void clear();

}