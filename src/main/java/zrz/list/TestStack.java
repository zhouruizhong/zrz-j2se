package zrz.list;

import java.util.Stack;
import java.util.Vector;

/**
 * @author zhouruizhong
 * @title: TestStack
 * @project zrz-j2se
 * @description 栈，它继承于Vector。它的特性是：先进后出(FILO, First In Last Out)
 * @date 2018/11/23 14:22
 */
public class TestStack {

    public static void main(String[] args) {
        Vector<String> stringStack = new Stack<>();
        stringStack.add("1,2,3");
        stringStack.add("4,5,6");
        stringStack.add("7,8,9");
        stringStack.add("10,11,12");
        int capacity = stringStack.capacity();
        System.out.println("capacity:" + capacity);
    }
}
