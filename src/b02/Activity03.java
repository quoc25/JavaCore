package b02;

import java.util.Scanner;

public class Activity03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n : ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=1; i<=n;i++){
            sum+=i;
        }
        float avg = (float)sum/n;
        System.out.println("sum = "+sum);
        System.out.println("avg = "+avg);
    }
}
