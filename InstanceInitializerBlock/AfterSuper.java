class A{
    A(){
        System.out.println("Parent class constructor invoked");
    }
}

class B extends A{

    B(){
        super();
        System.out.println("Child class constructor invoked");
    }

    {System.out.println("Instance initializer block is invoked");}

    public static void main(String args[]){
        B b = new B();
    }
}