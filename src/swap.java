import java.util.*;
public class swap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("swapping world:");
        System.out.println("first value:");
        int a=sc.nextInt();
        System.out.println("second value:");
        int b=sc.nextInt();
        int c=a;
        a=b;
        b=c;

        System.out.println("first value: " + a);
        System.out.println("second value: " + b);
    }

}
