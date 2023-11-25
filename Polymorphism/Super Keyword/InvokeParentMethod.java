class Human{
    void eat(){
        System.out.println("eating...");
    }
}

class Asian extends Human{
    void eat(){
        System.out.println("eating spicy...");
    }

    void work(){
        System.out.println("working...");
    }

    void play(){
        super.eat();
        work();
    }
}

class TestSuper2{
    public static void main(String args[]){
        Asian a = new Asian();
        a.play();
    }
}