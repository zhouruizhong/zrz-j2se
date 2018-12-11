package zrz.data;

/**
 * @author zhouruizhong
 * @date 2018/12/10 15:32
 */
public class Stack {

    private int[] elements;

    public Stack() {
        elements = new int[0];
    }

    public void push(int element) {
        int[] newElements = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        newElements[elements.length] = element;
        elements = newElements;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        int element = elements[elements.length - 1];
        int[] newElements = new int[elements.length - 1];
        for (int i = 0; i < newElements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
        return element;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        return elements[elements.length - 1];
    }

    public boolean isEmpty(){
        return elements.length == 0;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        int element = stack.pop();
        System.out.println(element);
        element = stack.peek();
        System.out.println(element);
    }
}
