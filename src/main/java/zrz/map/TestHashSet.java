package zrz.map;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 周瑞忠
 * @version 1.0
 * @project_name zrz-j2se
 * @package zrz.map
 * @class_name TestHashSet
 * @description java类作用描述
 * @createdate 2018/11/14 22:38
 */
public class TestHashSet {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>(16);

        stringSet.add("apple");
        stringSet.add("orange");
        stringSet.add("banana");
        stringSet.add("");
    }
}
