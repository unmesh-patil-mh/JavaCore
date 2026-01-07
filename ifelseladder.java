import java.util.Scanner;

public class ifelseladder {
    public static void main(String[] args){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        a=sc.nextInt();
        if(a>18){
            System.out.println("Your Age is Valid for 18+");
        }
        else if(a==18){
            System.out.println("You Are Exactly 18 years Old");
        }
        else{
            System.out.println("You Are Less than 18 years of Age");
        }
    }
}
