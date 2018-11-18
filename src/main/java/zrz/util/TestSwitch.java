package zrz.util;

/**
 * @author 周瑞忠
 * @version 1.0
 * @project_name zrz-j2se
 * @package zrz.util
 * @class_name TestSwitch
 * @description java类作用描述
 * @createdate 2018/11/17 18:42
 */
public class TestSwitch {

    public static void main(String[] args) {
        System.out.println(switchByte((byte) 1));
        System.out.println(switchShort((short) 2));
        System.out.println(switchInt(2));
        System.out.println(switchChar('c'));
        System.out.println(switchString("d"));
    }

    public static String switchChar(char c){
        String result = "";
        switch (c) {
            case 'a':
                result = "这是字母 a";
                break;
            case 'b':
                result = "这是字母 b";
                break;
            case 'c':
                result = "這是字母 c";
                break;
            case 'd':
                result = "這是字母 d";
                break;
            default:
                result = "请输入正确的字母";
        }
        return result;
    }

    public static String switchString(String s){
        String result = "";
        switch (s) {
            case "a":
                result = "这是字母 a";
                break;
            case "b":
                result = "这是字母 b";
                break;
            case "c":
                result = "這是字母 c";
                break;
            case "d":
                result = "這是字母 d";
                break;
            default:
                result = "请输入正确的字母";
        }
        return result;
    }

    public static String switchInt(int i){
        return switchByte((byte) i);
    }

    public static String switchByte(byte b){
        String result = "";
        switch (b) {
            case 1:
                result = "这是數字 1";
                break;
            case 2:
                result = "这是數字 2";
                break;
            case 3:
                result = "這是數字 3";
                break;
            case 4:
                result = "這是數字 4";
                break;
            default:
                result = "请输入正确的數字";
        }
        return result;
    }

    public static String switchShort(short s){
        return switchByte((byte) s);
    }
}
