import java.util.Scanner;
public class pro {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("welcome to calculator");
        System.out.println("enter the first :");
        int firstNum= input.nextInt();
        System.out.println("enter the second ");
        int secondNum= input.nextInt();
        int sum= firstNum+ secondNum;
        System.out.println("sum is " + sum);



    }
}
