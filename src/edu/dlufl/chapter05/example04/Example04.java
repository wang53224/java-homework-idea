package edu.dlufl.chapter05.example04;

/**
 * replace() 和 trim()方法的使用
 */
public class Example04 {
    public static void main(String[] args) {
        String s = "itcast";

        System.out.println("将it替换成cn. it的结果：" + s.replace("it","cn. it"));

        String s1 = "     i t c a s t     ";
        System.out.println("去除字符串两端空格后的结果：" + s1.trim());
        System.out.println("去除字符串中所有空格后的结果：" + s1.replace(" ",""));
    }
}
