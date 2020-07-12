package core.equals;

public class hashCode {
    public static void main(String[] args) {
        String s = "OK";
        StringBuilder sb = new StringBuilder(s);
        System.out.println("s.hashCode(): " + s.hashCode() + "\t\t" + "sb.hashCode(): " + sb.hashCode());

        String t = new String("OK");
        StringBuilder tb = new StringBuilder(t);
        System.out.println("t.hashCode(): " + t.hashCode() + "\t\t" + "tb.hashCode(): " + tb.hashCode());

        System.out.println(s == t);             //false
        System.out.println(s.equals(t));        //true
    //  System.out.println(s == sb);            //Error 不可比较的类型: java.lang.String 和 java.lang.StringBuilder
        System.out.println(s.equals(sb));       //false
    }
}
