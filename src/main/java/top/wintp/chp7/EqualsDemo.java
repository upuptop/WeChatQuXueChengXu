package top.wintp.chp7;

/**
 * description:
 * <p>
 * author:  upuptop
 * <p>
 * qq: 337081267
 * <p>
 * CSDN:   http://blog.csdn.net/pyfysf
 * <p>
 * cnblogs:   http://www.cnblogs.com/upuptop
 * <p>
 * blog:   http://wintp.top
 * <p>
 * email:  pyfysf@163.com
 * <p>
 * time: 2019/07/2019/7/24
 * <p>
 */
public class EqualsDemo {

    public static void main(String[] args) {
        String s1 = "HelloWorld";
        String s4 = new String("HelloWorld");


        System.out.println(s1.equals(s4));//true
        System.out.println(s1 == s4);//false
    }
}