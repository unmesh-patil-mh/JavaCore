import java.util.Scanner;

class circle {
    public static void main(String[] args){
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius of circle");
        r=sc.nextInt();
        System.out.println("Area of Ciircle is: "+(3.14*r*r));
    }
}
