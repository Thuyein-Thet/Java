class X{
    X foo(){
        return this;
    }

    void print(){
        System.out.println("Inside class X");
    }
}

class Y extends X{
    Y foo(){
        return this;
    }

    void print(){
        System.out.println("Inside class Y");
    }
}

class Z extends Y{
    Z foo(){
        return this;
    }

    void print(){
        System.out.println("Inside class Z");
    }
}

public class Example2 {
    public static void main(String args[]){
        X x = new X();
        x.foo().print();

        Y y = new Y();
        y.foo().print();

        Z z = new Z();
        z.foo().print();
    }
}
