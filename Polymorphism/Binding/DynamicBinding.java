class Animal{
    void eat(){
        System.out.println("Animal is eating...");
    }
}

class Cat extends Animal{
    void eat(){
        System.out.println("Cat is eating...");
    }

    public static void main(String args[]){
        Animal a = new Cat();
        a.eat();
    }
}