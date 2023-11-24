class C{
    D obj;

    C(D obj){
        this.obj = obj;
    }

    void display(){
        System.out.println(obj.data);
    }
}

class D{
    int data = 10;
    D(){
        C c = new C(this);
        c.display();
    }

    public static void main(String args[]){
        D d = new D();
    }
}