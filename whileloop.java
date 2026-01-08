import java.util.Scanner;

public class whileloop {
    public static void main(String[] args){
        int a=1;
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number Whoose table you want to find: ");
        num=sc.nextInt();
        while(a<=10){
            System.out.println(num+"*"+a+"="+(num*a));
            a++;
        }

    }
}
