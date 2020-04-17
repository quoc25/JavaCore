package b01;

import java.util.Scanner;

public class Activity03 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input NumberOne: ");
        int numberOne = sc.nextInt();
        System.out.println("Input NumberTwo: ");
        int numberTwo = sc.nextInt();

        System.out.printf("%d + %d = %d %n",numberOne,numberTwo,numberOne+numberTwo);
        System.out.printf("%d * %d = %d",numberOne,numberTwo,numberOne*numberTwo);

    }
}

