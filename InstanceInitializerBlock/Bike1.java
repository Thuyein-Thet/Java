class Bike1{

    int speed;

    Bike1(){
        System.out.println("Constructor is invoked");
    }

    {System.out.println("Instance initializer block invoked");}

    public static void main(String args[]){
        Bike1 bike = new Bike1();
        Bike1 bike1 = new Bike1();
    }
}