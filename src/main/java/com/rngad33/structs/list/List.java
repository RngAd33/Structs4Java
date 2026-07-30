package com.rngad33.structs.list;

/**
 * 线性表
 *
 * @param <T>
 */
public interface List<T> {

    /**
     * 头插
     *
     * @param data
     */
    void insertHead(T data);

    /**
     * 尾插
     *
     * @param data
     */
    void insertTail(T data);

    /**
     * 指定位置插入
     *
     * @param data
     * @param index
     * @return
     */
    boolean insert(T data, int index);

    /**
     * 指定位置查询
     *
     * @param index
     * @return
     */
    T query(int index);

    /**
     * 查询所有
     *
     * @return
     */
    T[] queryAll();

    /**
     * 指定位置删除
     *
     * @param index
     * @return
     */
    T remove(int index);

    /**
     * 指定位置更新
     *
     * @param data
     * @param index
     */
    void update(T data, int index);

    /**
     * 销毁表
     */
    void clear();

}