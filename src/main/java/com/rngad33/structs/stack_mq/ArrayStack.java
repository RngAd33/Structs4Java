package com.rngad33.structs.stack_mq;

import com.rngad33.structs.common.Constant;

/**
 * 顺序栈
 */
public class ArrayStack<T> implements Stack<T> {

    private T[] dataList;

    private int top;

    private static final int MAX_SIZE = Constant.MAX_SIZE;

    /**
     * 初始化顺序栈
     */
    public ArrayStack() {
        this.dataList = (T[]) new Object[MAX_SIZE];
        this.top = -1;
    }

    /**
     * 入栈
     *
     * @param data
     */
    @Override
    public void push(T data) {
        if (this.top >= MAX_SIZE) return;

        this.dataList[++top] = data;
    }

    /**
     * 出栈
     *
     * @return
     */
    @Override
    public T pop() {
        if (this.top < 0) return null;

        final T data = this.dataList[top];
        this.dataList[top] = null;
        return data;
    }

    /**
     * 遍历所有元素
     *
     * @return
     */
    @Override
    public T[] queryAll() {
        return this.dataList;
    }

    /**
     * 销毁栈
     */
    @Override
    public void clear() {
        for (int i = 0; i <= top; i++) {
            this.dataList[i] = null;
        }
    }

}