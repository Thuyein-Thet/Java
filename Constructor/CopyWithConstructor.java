class Dog{
    int id;
    String name;

    Dog(int i,String n){
        id = i;
        name = n;
    }

    Dog(Dog d){
        id = d.id;
        name = d.name;
    }

    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String args[]){
        
        Dog d1 = new Dog(1,"Bobby");
        Dog d2 = new Dog(d1);

        d1.display();
        d2.display();
    }
}