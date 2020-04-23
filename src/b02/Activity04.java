package b02;

import java.util.Scanner;

public class Activity04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First Number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Input Second Number:   ");
        int secondNumber = sc.nextInt();
        //cach 1:dung *=
                //firstNumber*=secondNumber;
                //System.out.println("ket qua la: "+firstNumber);
        //cach 2:dung cau lenh lap
        int result = 0;
        for(int i =1; i<= secondNumber; i++){

            result+= firstNumber;
        }
        System.out.println("Ket qua =" + result);


    }
}
