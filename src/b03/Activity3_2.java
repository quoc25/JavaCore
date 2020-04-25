package b03;

import java.util.Scanner;

public class Activity3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of the array 1: ");
        int side1 = scanner.nextInt();
        int[] myArray1 = new int[side1];

        System.out.println("Enter elements of the array 1: ");
        for (int i = 0; i < myArray1.length; i++) {
            System.out.printf("a[%d] = ", i);
            myArray1[i] = scanner.nextInt();
        }

        System.out.print("Enter the side of the array 2: ");
        int side2 = scanner.nextInt();
        int[] myArray2 = new int[side2];
        System.out.println("Enter elements of the array 2: ");
        for (int i = 0; i < myArray2.length; i++) {
            System.out.printf("a[%d] = ", i);
            myArray2[i] = scanner.nextInt();
        }

        System.out.print("Array 1 : ");
        for (int i = 0; i <myArray1.length ; i++) {
            System.out.print(myArray1[i]+"  ");
        }
        System.out.print("Length = "+side1+"\n");

        System.out.print("Array 2 : ");
        for (int i = 0; i <myArray2.length ; i++) {
            System.out.print(myArray2[i]+"  ");
        }
        System.out.print("Length = "+side2+"\n");

        System.out.println("==================================");
        System.out.println("Merged array:  "); System.out.print("Length : "+(side1+side2)+"\n");
        for (int i = 0; i <myArray1.length ; i++) {
            System.out.print(myArray1[i]+"  ");
        }
        for (int i = 0; i <myArray2.length ; i++) {
            System.out.print(myArray2[i]+"  ");
        }
    }
}
