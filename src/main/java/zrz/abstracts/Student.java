package zrz.abstracts;

/**
 * @author 唐朝
 * @version 1.0
 * @projectName zrz-j2se
 * @package zrz.abstracts
 * @className Student
 * @description java类作用描述
 * @createDate 2018/11/8 0:31
 * @updateUser 更新者
 * @updateDate 2018/11/8 0:31
 * @updateRemark 更新说明
 */
public abstract class Student {

    /**
     *  学习
     */
    abstract void study();

    /**
     *  睡觉
     */
    void sleep(){
        System.out.println("躺着");
    }
}
