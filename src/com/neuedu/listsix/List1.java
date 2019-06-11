package com.neuedu.listsix;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        /*创建一个List，在List 中增加三个工人，基本信息如下：
姓名 年龄 工资
zhang3 18 3000
li4 25 3500
wang5 22 3200 */
        List<String>lists=new ArrayList<String>();
        lists.add("zhang3 18 3000");
        lists.add("li4 25 3500");
        lists.add("wang5 22 3200");
        /*在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300 */
        lists.add(1,"zhao6 24 3300");
        /*删除wang5 的信息 */
        lists.remove("wang5 22 3200");
        /*利用for 循环遍历，打印List 中所有工人的信息 */
        for (String s:lists
             ) {
            System.out.println(s);
        }
        /*利用迭代遍历，对List 中所有的工人调用work 方法。 */

    }
}
