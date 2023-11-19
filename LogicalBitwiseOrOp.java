public class LogicalBitwiseOrOp {
    
    public static void main(String args[]){
        int a=10,b=5,c=20;

        System.out.println(a>b||a<c);
        System.out.println(a>b|a<c);
        
        System.out.println(a>b || a++<c);
        System.out.println(a); //Second condition is not checked, second condition will be checked If only first condition is false
        System.out.println(a>b | a++<c);
        System.out.println(a); //Second condition is cjecked
    }
}
