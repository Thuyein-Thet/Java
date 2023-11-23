public class FactorialRecursive {
    
    static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return(n*factorial(n-1));
        }
    }

    public static void main(String args[]){
        int f = 1;
        int number = 5;
        f=factorial(number);
        System.out.println("Factorial of "+number+" is "+f+".");
    }
}
