class Cat{
    int id;
    String name;

    Cat(int i, String n){
        id = i;
        name = n;
    }

    Cat(){

    }

    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String args[]){
        Cat c1 = new Cat(1,"Meow");
        Cat c2 = new Cat();

        c2.id = c1.id;
        c2.name = c1.name;

        c1.display();
        c2.display();
    }
}