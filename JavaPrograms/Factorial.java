import java.util.*;
public class Factorial {
    
    public static void main(String args[]){
        int i,f = 1;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find factorial:");
        int number = Integer.parseInt(in.nextLine());
        for(i=1;i<=number;i++){
            f=i*f;
        }

        System.out.println("Factorial of "+number+" is "+f+".");
    }
}
