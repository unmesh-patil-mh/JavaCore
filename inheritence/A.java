package inheritence;

import java.util.Scanner;

public class A {
    int a,b;
    void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number You want to Add:");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("The Addition of Number is: "+(a+b));
    }
}


