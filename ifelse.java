import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number you want to check: ");
        a=sc.nextInt();
        if(a%2==0){
            System.out.println("The Number Entered "+a+" Is Even...");
        }
        else{
            System.out.println("The Number Entered "+a+" Is Odd...");
        }
    }
}
