class Car{
    final void run(){
        System.out.println("driving");
    }
}

class Honda extends Car{
    void run(){
        System.out.println("Driving safely with 100kmph");
    }

    public static void main(String args[]){
        Honda h = new Honda();
        h.run();
    }
}