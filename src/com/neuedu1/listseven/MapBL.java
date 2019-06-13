package com.neuedu1.listseven;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapBL {
    public static void main(String[] args) {
//        1.遍历集合，并将序号与对应人名打印。
        Map<Integer,String> maps = new HashMap<Integer, String>();
        maps.put(1,"张三丰");
        maps.put(2,"周芷若");
        maps.put(3,"汪峰");
        maps.put(4,"灭绝师太");

        //向该map集合中插入一个编码为5姓名为李晓红的信息
        maps.put(5,"李晓红");

//        3.移除该map中的编号为1的信息
        maps.remove(1);

        maps.put(2,"周林");
        Iterator<Map.Entry<Integer, String>> i = maps.entrySet().iterator();
        while (i.hasNext()){
            Map.Entry<Integer, String> entry = i.next();
            System.out.println(entry.getKey()+entry.getValue());
        }



    }
}
