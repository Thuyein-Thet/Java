interface Printable{

}

class A implements Printable{
    public void a(){
        System.err.println("A Method");
    }
}

class B implements Printable{
    public void b(){
        System.out.println("B Method");
    }
}

class Call{
    void invoke(Printable p){
        if(p instanceof A){
            A a = (A)p;
            a.a();
        }
        if(p instanceof B){
            B b = (B)p;
            b.b();
        }
    }
}

class Test{
    public static void main(String args[]){
        Printable p = new B();
        Call c = new Call();
        c.invoke(p);
    }
}