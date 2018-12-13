package zrz.data;

import java.util.Arrays;

/**
 * @author zhouruizhong
 * @date 2018/12/10 15:50
 */
public class Queue {

    private int [] elements;

    public Queue(){
        elements = new int[0];
    }

    public void add(int element){
        int [] newElements = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        newElements[elements.length] = element;
        elements = newElements;
    }

    public void poll(){
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        int element = elements[0];
        int [] newElement = new int[elements.length -1];
        for (int i = 0; i < newElement.length; i++) {
            newElement[i] = elements[i+1];
        }
        elements = newElement;
    }

    public void show(){
        System.out.println(Arrays.toString(elements));
    }

    public boolean isEmpty(){
        return elements.length == 0;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.poll();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.show();
        queue.poll();
        queue.add(5);
        queue.add(6);
        queue.show();
    }
}
