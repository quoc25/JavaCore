package b03;

import java.util.Scanner;

public class Activity3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();
        int count = 0;
        char[] s2 = s1.toCharArray();
        for (int i = 0; i <s2.length ; i++) {
            System.out.print(s2[i]+"; ");
        }
        System.out.println("\n ==========================");
        char [] s3 = new char [s2.length];
        for (int i = 0; i < s2.length; i++) {
            for (int j = 0; j <= i; j++) {
                if(s2[i] == s2[j]) s3[i]++;
            }
        }
        count = s3[0];
        for (int i = 0; i < s2.length; i++) {
            if(s3[i]>count) count = s3[i];
        }
        for (int i = 0; i <s2.length ; i++) {
            if(s3[i]==count) System.out.println("Ky tu xuat hien nhieu nhat trong chuoi la: "+s2[i]
                    +" co " + +count+" lan xuat hien ");
        }



    }
}
