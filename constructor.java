import java.util.Scanner;

// BELOW IS OUR DEFAULT CONSTRUCTOR IT HAS NO DEFAULT VALUE
// public class constructor {
//     int roll;
//     String name;
//     constructor(){
//         roll=1;
//         name= "Unmesh";
//     }

//     public static void main(String[] args){
//         constructor c=new constructor();
//         System.out.println("Roll no-> "+c.roll);
//         System.out.println("Name-> "+c.name);
//     }
// }

// BELOW IS OUR PARAMETERIZED CONSTRUCTOR
public class constructor{
    int roll;
    String name;
    Scanner sc=new Scanner(System.in);
    constructor(int r,String n){
        roll=r;
        name=n;
        System.out.println("Roll NO="+roll);
        System.out.print("Name="+name);
        // System.out.println("Enter the Roll Number of Student: ");
        // roll=sc.nextInt();
        // sc.nextLine();
        // System.out.println("Enter the Name of Our Student: ");
        // name=sc.nextLine();
    }

    public static void main(String[] args){
        
        constructor c=new constructor(1,"Unmesh");
    }
}