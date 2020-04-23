package b02;

import java.util.Scanner;
/*
*       ^^^*        height = 4
*       ^^***       line = space + character
*       ^*****      space = n - line
*       *******     character = 2line - 1
* */

public class Activity01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input height: ");
        int height = sc.nextInt();

        String result = "";
        String space = "";
        String character = "";

        int line = 1;

        do{
            space = "";
            character="";
            for(int s = 1; s<= height-line;s++) space += "  ";
            for(int c = 1; c<= 2*line-1;c++) character+="* ";

            result += space + character + "\n";

            line++;
        }while(line<= height);
        System.out.println(result);
    }
}
