import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        // int a =10;
        // int b=20;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt(); 
        System.out.println("The Sum of our Numbers is: "+(a+b));
    }
}