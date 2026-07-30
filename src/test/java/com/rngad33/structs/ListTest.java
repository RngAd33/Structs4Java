package com.rngad33.structs;

import com.rngad33.structs.list.ArrayList;
import com.rngad33.structs.list.LinkedList;
import com.rngad33.structs.list.List;

/**
 * 顺序表与单链表性能对比测试
 *
 * <p>测试目标：测出频繁读和频繁写场景下的性能差异</p>
 */
public class ListTest {

    /** 测试数据规模（需小于 Constant.MAX_SIZE=100，预留写操作空间） */
    private static final int DATA_SIZE = 80;
    /** 读操作次数 */
    private static final int READ_OPS = 100000;
    /** 写操作次数 */
    private static final int WRITE_OPS = 50;

    public static void main(String[] args) {
        try {
            System.out.println("========== 顺序表 vs 单链表 性能测试 ==========");
            System.out.println("数据规模: " + DATA_SIZE);
            System.out.println("读操作次数: " + READ_OPS);
            System.out.println("写操作次数: " + WRITE_OPS);
            System.out.println();

            // 1. 频繁随机读测试
            testFrequentRead();

            System.out.println();

            // 2. 频繁中间写（插入/删除）测试
            testFrequentWrite();

            System.out.println();

            // 3. 频繁头插测试
            testFrequentHeadInsert();

            System.out.println();

            // 4. 频繁尾插测试
            testFrequentTailInsert();

            System.out.println();

            // 5. 遍历测试
            testTraverse();
        } catch (Exception e) {
            System.err.println("测试执行出错: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 频繁随机读测试：顺序表 O(1) 应远快于链表 O(n)
     */
    private static void testFrequentRead() {
        System.out.println(">>> 【场景1】频繁随机读测试 <<<");

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // 初始化数据
        for (int i = 0; i < DATA_SIZE; i++) {
            arrayList.insertTail(i);
            linkedList.insertTail(i);
        }

        // 顺序表随机读
        long start = System.nanoTime();
        for (int i = 0; i < READ_OPS; i++) {
            int index = (i * 7 + 13) % DATA_SIZE + 1; // 伪随机位置（1-based）
            arrayList.query(index);
        }
        long arrayReadTime = System.nanoTime() - start;

        // 链表随机读
        start = System.nanoTime();
        for (int i = 0; i < READ_OPS; i++) {
            int index = (i * 7 + 13) % DATA_SIZE + 1;
            linkedList.query(index);
        }
        long linkedReadTime = System.nanoTime() - start;

        printResult("ArrayList", arrayReadTime);
        printResult("LinkedList", linkedReadTime);
        printWinner("随机读", arrayReadTime, linkedReadTime);
    }

    /**
     * 频繁中间写测试：在中间位置频繁插入和删除
     */
    private static void testFrequentWrite() {
        System.out.println(">>> 【场景2】频繁中间位置插入/删除测试 <<<");

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // 初始化数据
        for (int i = 0; i < DATA_SIZE; i++) {
            arrayList.insertTail(i);
            linkedList.insertTail(i);
        }

        // 顺序表中间插入+删除
        long start = System.nanoTime();
        for (int i = 0; i < WRITE_OPS; i++) {
            int index = (i * 11 + 7) % (DATA_SIZE / 2) + DATA_SIZE / 4 + 1;
            arrayList.insert(-i, index);
            arrayList.remove(index);
        }
        long arrayWriteTime = System.nanoTime() - start;

        // 链表中间插入+删除
        start = System.nanoTime();
        for (int i = 0; i < WRITE_OPS; i++) {
            int index = (i * 11 + 7) % (DATA_SIZE / 2) + DATA_SIZE / 4 + 1;
            linkedList.insert(-i, index);
            linkedList.remove(index);
        }
        long linkedWriteTime = System.nanoTime() - start;

        printResult("ArrayList", arrayWriteTime);
        printResult("LinkedList", linkedWriteTime);
        printWinner("中间写", arrayWriteTime, linkedWriteTime);
    }

    /**
     * 频繁头插测试
     */
    private static void testFrequentHeadInsert() {
        System.out.println(">>> 【场景3】频繁头插测试 <<<");

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        int ops = Math.min(WRITE_OPS, 2000); // 头插开销大，减少次数

        // 顺序表头插
        long start = System.nanoTime();
        for (int i = 0; i < ops; i++) {
            arrayList.insertHead(i);
        }
        long arrayTime = System.nanoTime() - start;

        // 链表头插
        start = System.nanoTime();
        for (int i = 0; i < ops; i++) {
            linkedList.insertHead(i);
        }
        long linkedTime = System.nanoTime() - start;

        printResult("ArrayList", arrayTime);
        printResult("LinkedList", linkedTime);
        printWinner("头插", arrayTime, linkedTime);
    }

    /**
     * 频繁尾插测试
     */
    private static void testFrequentTailInsert() {
        System.out.println(">>> 【场景4】频繁尾插测试 <<<");

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // 顺序表尾插
        long start = System.nanoTime();
        for (int i = 0; i < DATA_SIZE; i++) {
            arrayList.insertTail(i);
        }
        long arrayTime = System.nanoTime() - start;

        // 链表尾插
        start = System.nanoTime();
        for (int i = 0; i < DATA_SIZE; i++) {
            linkedList.insertTail(i);
        }
        long linkedTime = System.nanoTime() - start;

        printResult("ArrayList", arrayTime);
        printResult("LinkedList", linkedTime);
        printWinner("尾插", arrayTime, linkedTime);
    }

    /**
     * 遍历测试
     */
    private static void testTraverse() {
        System.out.println(">>> 【场景5】遍历所有元素测试 <<<");

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < DATA_SIZE; i++) {
            arrayList.insertTail(i);
            linkedList.insertTail(i);
        }

        int rounds = 10000;

        // 顺序表遍历
        long start = System.nanoTime();
        for (int r = 0; r < rounds; r++) {
            Integer[] arr = arrayList.queryAll();
            long sum = 0;
            for (Integer val : arr) {
                sum += val;
            }
        }
        long arrayTime = System.nanoTime() - start;

        // 链表遍历
        start = System.nanoTime();
        for (int r = 0; r < rounds; r++) {
            Integer[] arr = linkedList.queryAll();
            long sum = 0;
            for (Integer val : arr) {
                sum += val;
            }
        }
        long linkedTime = System.nanoTime() - start;

        printResult("ArrayList", arrayTime);
        printResult("LinkedList", linkedTime);
        printWinner("遍历", arrayTime, linkedTime);
    }

    private static void printResult(String name, long nanoTime) {
        double ms = nanoTime / 1_000_000.0;
        System.out.printf("  %-12s: %10.3f ms (%d ns)%n", name, ms, nanoTime);
    }

    private static void printWinner(String scene, long arrayTime, long linkedTime) {
        if (arrayTime < linkedTime) {
            double ratio = (double) linkedTime / arrayTime;
            System.out.printf("  => 顺序表在【%s】场景下更快，约为链表的 %.2f 倍%n", scene, ratio);
        } else {
            double ratio = (double) arrayTime / linkedTime;
            System.out.printf("  => 链表在【%s】场景下更快，约为顺序表的 %.2f 倍%n", scene, ratio);
        }
    }
}
