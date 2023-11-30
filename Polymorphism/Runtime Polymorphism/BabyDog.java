class Animal{
    void eat(){
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating...");
    }
}

class BabyDog extends Dog{
    public static void main(String args[]){
        Animal a = new BabyDog();
        a.eat();
    }
}