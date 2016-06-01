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

        int y=0;
        int x=0;
        try {
            System.out.print("число1: ");
            x = in.nextInt();
            System.out.print("число2: ");
            y = in.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.print("Где цифры?");
        }
        in.nextLine();
        System.out.print("выбери знак: ");
        String str3 = in.nextLine();
        switch (str3) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                System.out.println(x / y);
                break;
            default:
                System.out.println("Попробуй заново");
                break;
        }
    }
}

