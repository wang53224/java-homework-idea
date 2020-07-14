 package core.enums;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size (SMALL,MEDIUM,LARGE,EXTRA_LARGE): ");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);    //toString的逆方法,这里将size设置为Size.input

        System.out.println("size = " + size);
        System.out.println("abbreviation = " + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE) {
            System.out.println("Good job -- you paid attention to the _.");
        }

        System.out.println(Size.SMALL.toString());      ////toString方法,返回枚举常量名,这里返回字符串“SMALL”
    }
}
