import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int a[]=new int[10];  //Array is Initialized
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Numbers you want to Enter in Array: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
            if(a[i]+a[j]==20){
                System.out.println("The Addition of "+a[i]+"+"+a[j]+"="+(a[i]+a[j]));
            }
        }
        }
        
    }
}
