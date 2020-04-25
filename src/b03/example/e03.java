package b03.example;

public class e03 {
    public static void main(String[] args) {
        String s1 = "Day la chuoi so 1";
        String s2 = new String("Day la chuoi so 2");
        String s3 = new String(new char[]{'d', 'a', 'y', 'l', 'a'});

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);

        int[] a = new int[]{1, 2, 3};

        System.out.println("a length = " + a.length);

        System.out.println("s1 length = " + s1.length());
        System.out.println("s2 length = " + s2.length());
        System.out.println("s3 length = " + s3.length());

    }
}
