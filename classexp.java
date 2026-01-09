import java.util.Scanner;

public class classexp {
    int roll;
    String name;
    Scanner sc = new Scanner(System.in);
    void display(){
        System.out.println("Enter the Roll Number of Student: ");
        roll=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Name of Our Student: ");
        name=sc.nextLine();
        System.out.println("Roll no -> "+roll+"\nName -> "+name);
    }
    public static void main(String[] args){
        classexp c=new classexp(); //This is part where we initialize our class in our main by object c
        c.display(); //Here we will display our function defined in our class
    }
}

