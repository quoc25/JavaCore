package b03;

import java.util.Scanner;

public class Activity3_4 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a string: ");
          String s1 = sc.nextLine();

            char[] s2 = s1.toCharArray();
            for(int i=0;i<s1.length()/2;i++){
            char temp=s2[i];
            s2[i]=s2[s2.length-i-1];
            s2[s2.length-i-1]=temp;
        }
        String result= String.valueOf(s2);

        System.out.println("Reverse of that string is: "+ result);

    }
}

