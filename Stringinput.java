import java.util.Scanner;

public class Stringinput {
    public static void main(String[] args){
        int roll;
        String name,city;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll Number of student: ");
        roll = sc.nextInt();
        sc.nextLine();
        // Here befor accepting string data if we enter integer data we need to break our line so that it will accept each line seprately
        System.out.println("Enter the Name of student: ");
        name = sc.nextLine();
        System.out.println("Enter the City of Student: ");
        city =sc.nextLine();
        System.out.println("The Roll No of student is: "+roll);
        System.out.println("The Name of student is: "+name);
        System.out.println("The City of student is: "+city);

    }
}
