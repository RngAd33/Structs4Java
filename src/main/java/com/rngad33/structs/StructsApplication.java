package com.rngad33.structs;

import com.rngad33.structs.list.ArrayList;
import com.rngad33.structs.list.LinkedList;

import java.util.Arrays;

public class StructsApplication {

    public static void main(String[] args) {
        // 测试顺序表
//        ArrayList<Integer> arrayList = new ArrayList<>();

        // 测试单链表
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++){
            linkedList.insertTail(i);
        }
        System.out.println(Arrays.toString(linkedList.queryAll()));
    }

}