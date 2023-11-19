public class UnaryOp {
    public static void main(String args[]){
        int x=10;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);

        int a=10;
        int b=10;

        System.out.println(a++ + ++a);
        System.out.println(b++ + b++);

        int c=1,d=-1;
        System.out.println(~c);
        System.out.println(~d);

        boolean z=true;
        boolean y=false;
        System.out.println(!z);
        System.out.println(!y);
    }
}
