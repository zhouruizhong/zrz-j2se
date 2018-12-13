package zrz.data;

/**
 * @author zhouruizhong
 * @date 2018/12/10 16:01
 */
public class TestNode {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.append(n2);
        n2.append(n3);

        System.out.println(n1.next().next().getData());
    }
}
