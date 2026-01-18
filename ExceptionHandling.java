import java.util.Scanner;

public class ExceptionHandling {
    int a,b;
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Numerator Number: ");
        a=sc.nextInt();
        System.out.println("Enter the Denominator Number: ");
        b=sc.nextInt();
    }

    void div(){
        try{
            System.out.println("The Division of Number is: "+(a/b));
        }catch(Exception e){
            System.out.println("Eception was caught");
        }
        finally{
            System.out.println("If exception occur it was handled correctly ");
        }
    }

    void show(){
        System.out.println("Here we end our code");
    }

    public static void main(String[] args) {
        ExceptionHandling e =new ExceptionHandling();
        e.accept();
        e.div();
        e.show();
    }
}
