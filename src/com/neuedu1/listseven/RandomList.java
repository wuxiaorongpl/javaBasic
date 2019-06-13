package com.neuedu1.listseven;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList {
    public static void main(String[] args) {
        /*产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。*/
        List<Integer> lists=new ArrayList();
        for (int j = 0; j < 10; j++) {
                    Random random = new Random();
                    int i = 1+random.nextInt(101);
                    if (i>=10){
                        lists.add(i);
                    }
                }
            System.out.println(lists);
            }
}

