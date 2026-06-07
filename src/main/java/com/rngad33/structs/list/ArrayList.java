package com.rngad33.structs.list;

import com.rngad33.structs.common.Constant;

/**
 * 顺序表
 *
 * @param <T>
 */
public class ArrayList<T> {

    private T[] dataList;

    private int length;

    private static final int MAX_SIZE = Constant.MAX_SIZE;

    /**
     * 初始化顺序表
     */
    public ArrayList() {
        this.dataList = (T[]) new Object[MAX_SIZE];
        this.length = 0;
    }

    /**
     * 插入元素（头插）
     *
     * @param data
     */
    public void insertHead(T data) {
        // 向后移动所有前驱元素
        for (int i = length-1; i > 0; i--) {
            this.dataList[i] = this.dataList[i - 1];
        }
        this.dataList[0] = data;
        length++;
    }

    /**
     * 插入元素（尾插）
     *
     * @param data
     * @return
     */
    public void insertTail(T data) {
        if (this.length >= MAX_SIZE) return;

        this.dataList[length] = data;
        length++;
    }

    /**
     * 插入元素（指定位置插入）
     *
     * @param index
     * @param data
     * @return
     */
    public boolean insert(int index, T data) {
        if (this.length >= MAX_SIZE) {
            return false;
        }
        if (!this.checkIndex(index)) {
            return false;
        }
        for (int i = length; i > index; i--) {
            this.dataList[i] = this.dataList[i - 1];
        }
        this.dataList[index] = data;
        length++;
        return true;
    }

    /**
     * 查询指定位置元素
     *
     * @param index
     * @return
     */
    public T query(int index) {
        if (!this.checkIndex(index)) return null;
        return this.dataList[index];
    }

    /**
     * 删除元素
     *
     * @param index
     * @return
     */
    public T delete(int index) {
        if (!this.checkIndex(index)) return null;

        int target = index-1;
        T pop = this.dataList[target];
        // 向前移动所有后继元素
        for (int i = target; i < length; i++) {
            this.dataList[i] = this.dataList[i + 1];
        }

        length--;
        return pop;
    }

    /**
     * 更新元素
     *
     * @param index
     * @param data
     */
    public void update(int index, T data) {
        if (!this.checkIndex(index)) return;
        this.dataList[index] = data;
    }

    /**
     * 检查索引是否合法
     *
     * @param index
     * @return
     */
    private boolean checkIndex(int index) {
        return index > 0 || index <= length;
    }

}