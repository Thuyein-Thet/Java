public class LogicalOp {
    
    public static void main(String args[]){
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b && a<c); //&& check second condition if only the first is true
        System.out.println(a<b & a<c); //& check both conditions whether first condition is true or not
    }
}
