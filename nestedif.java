import java.util.Scanner;

public class nestedif {
    public static void main(String[] args){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age for Driving Liscence: ");
        a=sc.nextInt();
        if(a>=18){
            if(a==18){
                System.out.println("Your Age is valid for Learning Liscence..");
            }
            else{
                System.out.println("Your Age is valid for Driving Liscence..");
            }
        }
        else{
            System.out.println("Entered age is Not Valid for Liscence...");
        }
    }
}
