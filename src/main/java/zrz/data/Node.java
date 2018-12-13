package zrz.data;

/**
 * @author zhouruizhong
 * @date 2018/12/10 15:59
 */
public class Node {
    /**
     * 节点内容
     */
    private int data;

    private Node next;

    public Node(int data){
        this.data = data;
    }

    public Node append(Node node){
        Node currentNode = this;
        while (true){
            Node nextNode = currentNode.next;
            if (null == nextNode){
                break;
            }
            currentNode = nextNode;
        }
        currentNode.next = node;
        return this;
    }

    public Node next(){
        return this.next;
    }

    public int getData(){
        return this.data;
    }
}

