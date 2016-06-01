/**
 * Created by user on 6/1/2016.
 */

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello world");
        String str = "Vlados";
        String str2 = "Vano";
        System.out.println(str+str2);
        int a = 1, b = 5;
        System.out.println(a + b);
        Scanner in = new Scanner(System.in);
        System.out.print("имя: ");
        String name = in.nextLine();
        System.out.print("второе имя: ");
        String name2 = in.nextLine();
        System.out.println(name+name2);
        System.out.println();
        System.out.print("число1: ");
        int x = in.nextInt();
        System.out.print("число2: ");
        int y = in.nextInt();
        System.out.print("выбери знак: ");
        String str3 = in.nextLine();
        if (str3 == "+")
            System.out.println(x + y);
        else if (str3 == "-")
            System.out.println(x - y);
        else if (str3 == "*")
            System.out.println(x * y);
        else if (str3 == "/")
            System.out.println(x / y);
    }
}

