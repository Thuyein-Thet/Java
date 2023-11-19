public class BitwiseOp {
    
    public static void main(String args[]){
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b && a++<c); 
        System.out.println(a); // && didn't check second condition
        System.out.println(a<b & a++<c);
        System.out.println(a); // & checked second condition
    }
}
