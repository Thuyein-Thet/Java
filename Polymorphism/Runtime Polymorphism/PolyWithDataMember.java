class Car{
    int speedlimit = 90;
}

class Honda extends Bike{
    int speedlimit = 150;

    public static void main(String args[]){
        Car obj = new Honda();
        System.out.println(obj.speedlimit);
    }
}