package b03.example;
import java.util.Scanner;
public class e02 {


            public static void increase(int[] a, int step) {
                for (int i = 0; i < a.length; i++) {
                    a[i] += step;
                }

                step = 1000;
            }

            public static void print(int[] a) {
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i] + " ");
                }
            }

            public static void main(String[] args) {

                int a[] = new int[]{21, 46, 5, 14, 68, 90};

                System.out.println("Before: ");
                print(a);

                int step = 5;
                System.out.println("\nBefore Step : " + step);

                increase(a, step);

                System.out.println("\nAfter Step : " + step);

                System.out.println("\nAfter: ");
                print(a);

            }


        }



