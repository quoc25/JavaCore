package b03;
import java.util.Scanner;

public class Activity3_1 {
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
        System.out.println("Length: "+side);

        int afterSide = 0;
        boolean isExist =false;
        int [] afterArray = new int[side];
        for (int i = 0; i <myArray.length ; i++) {
            isExist = false;
            for (int j = 0; j <myArray.length ; j++) {
                if(myArray[i]==afterArray[j]){
                    isExist =true;
                    break;
                }
            }
            if(!isExist){
                afterArray[afterSide] = myArray[i];
                afterSide++;
            }
        }
        int [] result = new int[afterSide];
        for (int i = 0; i <result.length ; i++) {
            System.out.printf(afterArray[i]+"; ");
        }
        System.out.println("Length: "+afterSide);

    }
}
