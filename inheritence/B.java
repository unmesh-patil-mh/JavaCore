package inheritence;


import java.util.Scanner;

public class B extends A {
    int c,d;
    void show(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to substract: ");
        c=sc.nextInt();
        d=sc.nextInt();
        System.out.println("The Subtraction of the numbers is: "+(c-d));
    }

    public static void main(String[] args) {
        B b = new B();
        b.sum();
        b.show();
    }
}
