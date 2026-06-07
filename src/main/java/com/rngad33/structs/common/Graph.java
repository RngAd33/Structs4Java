package com.rngad33.structs.common;

/**
 * 图
 *
 * @param <T>
 */
public class Graph<T> {

    private final int MAX_SIZE = Constant.MAX_SIZE;

    // 权值
    private final int MAX;

    // 顶点信息
    private T[] v;

    // 邻接矩阵
    private int[][] arcs;

    // 边数
    private int e;

    // 顶点数
    private int n;

    public Graph() {
        this.MAX = Constant.MAX;
    }

    /**
     * 查找顶点
     *
     * @param v 顶点
     * @return 顶点索引号
     */
    public int locateVex(T v) {
        for (int i = 0; i < n; i++) {
            if (this.v[i].equals(v)) {
                return i;
            }
        }
        return -1;
    }

}