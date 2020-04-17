package b01;

import java.util.Scanner;

public class Activity01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number a: ");
        int a = sc.nextInt();
        System.out.print("Input number b: ");
        int b = sc.nextInt();
        System.out.printf("1. %d + %d = %d %n",a,b,a+b);
        System.out.printf("2. %d - %d = %d %n",a,b,a-b);
        System.out.printf("3. %d * %d = %d %n",a,b,a*b);
        System.out.printf("4. %d / %d = %d %n",a,b,a/b);
        System.out.printf("5. %d %s %d = %d %n",a,"%",b,a%b);
    }

}
