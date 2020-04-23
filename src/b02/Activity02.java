package b02;

import java.util.Scanner;

public class Activity02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number: ");
        int number = sc.nextInt();

        System.out.println();
        for (int i = 1; i <= number ; i++) {
            for (int j = 1; j <= number ; j++) {
                if(i==1||j==number) {
                    System.out.print("* ");
                }else if(i==number||j==1) {
                    System.out.print("* ");
                }else if(i==j||i+j==number){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
           System.out.println();
        }

        }
    }

