class B{
    B(){
        this(7);
        System.out.println("Hello B");
    }

    B(int x){
        System.out.println(x);
    }
}

class TestThis4{
    public static void main(String args[]){
        B b = new B();
    }
}