class Car{

    int id;
    String name;
    int model;

    Car(int i, String n){
        id = i;
        name = n;
    }

    Car(int i, String n, int m){
        id = i;
        name = n;
        model = m;
    }

    void display(){
        System.out.println(id+" "+name+" "+model);
    }
    public static void main(String args[]){
        Car c1 = new Car(1,"BMW",2020);
        Car c2 = new Car(2,"TOYOTA",2023);

        c1.display();
        c2.display();
    }
}