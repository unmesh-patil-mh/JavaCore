import java.util.Scanner;

public class loop {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Your Age: ");
        a=sc.nextInt();
        if(a>18){
            System.out.println("Your are Valid to enter here becouse you are 18+");
        }
    }
}
