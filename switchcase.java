import java.util.Scanner;

public class switchcase {
    public static void main(String[] args){
        int num;
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        a=sc.nextInt();
        System.out.println("Enter the Second Number: ");
        b=sc.nextInt();
        System.out.println("Enter the Operation You Want to perform\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Remainder");
        num=sc.nextInt();
        switch(num){
            case 1:
            System.out.println("Addition of Number is: "+(a+b));
            break;
            case 2:
            System.out.println("Subtraction of Number is: "+(a-b));
            break;
            case 3:
            System.out.println("Multiplication of Number is: "+(a*b));
            break;
            case 4:
            System.out.println("Division of Number is: "+(a/b));
            break;
            case 5:
            System.out.println("Remainder of Number is: "+(float)(a%b));
            // By adding float ans will be in float
            break;
        }
    }
}
