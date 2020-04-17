package b01;

import java.util.Scanner;

public class Activity04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = sc.nextInt();
        System.out.println("Bang cuu chuong "+ number);
        for(int i=1;i<=10;i++){
            System.out.printf("- %d * %d = %d %n",number,i,number*i);
        }
    }
}
