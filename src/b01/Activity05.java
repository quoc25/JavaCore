package b01;

import java.util.Scanner;

public class Activity05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number: ");
        int n = sc.nextInt();

        System.out.printf("%d+%d+%d=%d",n,10*n+n,100*n+10*n+n,100*n+20*n+3*n);
    }
}
