package com.rngad33.structs.stack_mq;

/**
 * 栈
 *
 * @param <T>
 */
public interface Stack<T> {

    void push(T data);

    T pop();

    T[] queryAll();

    void clear();

}