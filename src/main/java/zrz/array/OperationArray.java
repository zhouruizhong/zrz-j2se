package zrz.array;

import java.util.Arrays;

/**
 * @author zhouruizhong
 * @date 2018/12/10 14:42
 */
public class OperationArray {

    private int [] elements;

    public OperationArray(){
        elements = new int[0];
    }

    public int size(){
        return elements.length;
    }

    public void add(int element){
        int [] newElements = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        newElements[elements.length] = element;
        elements = newElements;
    }

    public void insert(int index, int element){
        if(index < 0 || index > elements.length -1){
            throw new RuntimeException("下标越界");
        }
        int [] newElements = new int[elements.length + 1];
        for (int i = 0; i < newElements.length; i++) {
            if (i == index) {
                newElements[i] = element;
            }else if (i > index){
                newElements[i] = elements[i-1];
            }else {
                newElements[i] = elements[i];
            }
        }
        elements = newElements;
    }

    public int get(int index){
        return elements[index];
    }

    public void show(){
        System.out.println(Arrays.toString(elements));
    }

    public void remove(int index){
        if(index < 0 || index > elements.length -1){
            throw new RuntimeException("下标越界");
        }

        int [] newElements = new int[elements.length - 1];
        for (int i = 0; i < newElements.length; i++) {
            if (i >= index){
                newElements[i] = elements[i+1];
            }else{
                newElements[i] = elements[i];
            }
        }
        elements = newElements;
    }

    public void delete(int value){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value){
                this.remove(i);
                delete(value);
            }
        }
    }

    public void set(int index, int value){
        if(index < 0 || index > elements.length -1){
            throw new RuntimeException("下标越界");
        }
        for (int i = 0; i < elements.length; i++) {
            if (i == index) {
                elements[i] = value;
            }
        }
    }

    public static void main(String[] args) {
        OperationArray array = new OperationArray();
        array.add(1);
        array.add(4);
        array.add(5);
        array.add(8);
        array.show();

        array.insert(1,2);
        array.show();
        array.insert(4,5);
        array.show();

        array.remove(1);
        array.show();
        array.delete(4);
        array.show();
        array.set(2, 7);
        array.show();
    }
}
