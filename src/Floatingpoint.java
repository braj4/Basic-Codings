import java.util.Scanner;
public class Floatingpoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.out.println("the floating system \n");
        System.out.println("enter the first number:");
        double first=sc.nextDouble();
        System.out.println("enter the second number:");
        double second=sc.nextDouble();
        double mul=first*second;
        System.out.println("\n Result is: " +mul);

    }
}
