package com.neuedu1.listseven;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.ArrayList;

public class ListTest {
//    定义一个方法listTest(ArrayList<Integer> al, Integer s)，
// 要求返回s在al里面第一次出现的索引，如果s没出现过返回-1
    public static void main(String[] args) {
        ArrayList<Integer> lists= new ArrayList<>();
        lists.add(2);
        lists.add(4);
        lists.add(6);
        lists.add(8);


        listTest(lists,2);
    }


    public static void listTest(ArrayList<Integer>al,Integer s){
        for (int i=0;i<al.size();i++){
            if (al.get(i)==s)
                System.out.println(i);
        }
        System.out.println(-1);
    }

}
