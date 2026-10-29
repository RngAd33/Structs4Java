package com.rngad33.structs.stack_mq;

import static com.rngad33.structs.constant.StructConstant.*;

/**
 * 顺序队列
 *
 * @param <T>
 */
public class ArrayMq<T> {

    private final T[] dataList;

    private int top;

    public ArrayMq() {
        this.dataList = (T[]) new Object[MAX_SIZE];
        this.top = -1;
    }

}