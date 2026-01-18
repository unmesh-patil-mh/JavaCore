
import java.util.Scanner;
import java.sql.SQLException;

public class MultiThreading {
    public void run(){
        try{
            for(int i=10;i>=1;i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println("The Exception is caught");
        }
    }

    public static void main(String[] args) {
        MultiThreading m=new MultiThreading();
        m.run();
    }
}
