package com.rngad33.structs;

import cn.hutool.core.date.StopWatch;
import cn.hutool.core.util.RandomUtil;
import com.rngad33.structs.list.ArrayList;
import com.rngad33.structs.list.LinkedList;

import java.util.Arrays;

public class StructsApplication {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        // 测试顺序表
        stopWatch.start();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            arrayList.insertTail(RandomUtil.randomInt(10));
        }
        stopWatch.stop();
        System.out.println(Arrays.toString(arrayList.queryAll()));
        System.out.println(stopWatch.getLastTaskTimeMillis());

        // 测试单链表
        stopWatch.start();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100; i++){
            linkedList.insertTail(RandomUtil.randomInt(10));
        }
        stopWatch.stop();
        System.out.println(Arrays.toString(linkedList.queryAll()));
        System.out.println(stopWatch.getLastTaskTimeMillis());
    }
}