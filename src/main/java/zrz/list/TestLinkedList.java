package zrz.list;

import java.util.LinkedList;
import java.util.List;

/**
 * 是一个双向链表。它也可以被当作堆栈、队列或双端队列进行操作。LinkedList随机访问效率低，但随机插入、随机删除效率低。
 * @author zhouruizhong
 * @date 2018/11/23 11:59
 */
public class TestLinkedList {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("jack");
    }
}
