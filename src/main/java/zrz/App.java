package zrz;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String s1 = "money";
        String s2 = new String("money");

        s2 = s2.intern();

        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("s1 等于 s2");
        } else {
            System.out.println("s1 不等于 s2");
        }

        if (s1.compareToIgnoreCase(s2) == 0) {
            System.out.println("s1 compare s2");
        } else {
            System.out.println("s1 not compare s2");
        }
    }
}
