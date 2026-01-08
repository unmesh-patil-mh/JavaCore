import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args){
        int num;
        int fact =1;
        int a =1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whoose factorial you want to find: ");
        num=sc.nextInt();
        do{
            fact=fact*(num);
            num--;
        }
        while(num>0);

        System.out.println("The factorial of our number is: "+fact);

    }


}
