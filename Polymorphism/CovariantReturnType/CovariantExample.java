class C{
    C foo(){
        return this;
    }

    void print(){
        System.out.println("Inside the class C");
    }
}

class D extends C{
    C foo(){
        return this;
    }

    void print(){
        System.out.println("Inside the class D");
    }
}

class E extends D{
    C foo(){
        return this;
    }

    void print(){
        System.out.println("Inside the class E");
    }
}

public class CovariantExample{
    public static void main(String args[]){
        C c = new C();
        c.foo().print();

        D d = new D();
        ((D)d.foo()).print();

        E e = new E();
        ((E)e.foo()).print();
    }
}