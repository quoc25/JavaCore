package b03;

import java.util.Scanner;

public class Activity3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of the array: ");
        int side = scanner.nextInt();
        int [] myArray  = new int[side];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("a[%d] = ",i);
            myArray[i] = scanner.nextInt();
        }

        for (int i = 0; i <myArray.length ; i++) {
            System.out.print(myArray[i]+"; ");
        }
        System.out.println("\n=================================");
        // 1,2.  Value and position of maximum  and minimum element
        int min = myArray[0];int indexOfMin = 0;
        int max = myArray[0];int indexOfMax = 0;
        for (int i = 0; i <myArray.length ; i++) {
            if(myArray[i]<min){
                min = myArray[i];
                indexOfMin = i;
            }
            if(myArray[i]>max){
                max = myArray[i];
                indexOfMax = i;
            }
        }
        System.out.println("1-Max of array: "+max+" , position : "+ indexOfMax );
        System.out.println("2-Min of array: "+min +" , position : " +indexOfMin);

        // 3,4.Value and position of 2nd maximum element
        int secondOfMax = myArray[0];int indexOSMax = 0;
        int secondOfMin = myArray[0];int indexOSMin = 0;
        for (int i = 0; i <myArray.length ; i++) {
            if(myArray[i]>secondOfMax && myArray[i]<max){
                secondOfMax = myArray[i]; indexOSMax = i;
            }
            if (myArray[i] < secondOfMin && myArray[i] > min) {
                secondOfMax = myArray[i];indexOSMin = i;
            }
        }

        System.out.println("3-2nd maximum of array: "+secondOfMax+" , position : "+ indexOSMax);
        System.out.println("4-2nd miniimum of array: "+secondOfMin+" , position : "+ indexOSMin);

        //6. Sort the array in ascending order
        int temp = myArray[0];
        System.out.print("6. Sort the array in ascending order: ");
        for (int i = 0 ; i < myArray.length - 1; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    temp = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temp;
                }
            }
            System.out.print(myArray[i]+"; ");
        }
        //5.Replace all negative element by zero
        System.out.print("\n5-Replace all negative element by zero: ");
        for (int i = 0; i <myArray.length ; i++) {
            if(myArray[i]<0){
                myArray[i] =0;
            }
            System.out.print(myArray[i]+"; ");
        }

    }
}
