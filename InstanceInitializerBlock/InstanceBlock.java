class X{
    X(){
        System.out.println("Parent Constructor");
    }
}

class Y extends X{
    Y(){
        super();
        System.out.println("Child Constructor");
    }

    Y(int a){
        super();
        System.out.println("Child Constructor "+a);
    }

    {System.out.println("Instance Initializer Block");}

    public static void main(String args[]){
        Y y1 = new Y();
        Y y2 = new Y(10);
    }
}
