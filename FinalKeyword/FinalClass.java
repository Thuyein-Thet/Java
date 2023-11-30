final class Bicycle{
    
}


class Toyota extends Bicycle{
    void run(){
        System.out.println("Running safely with 100kmph");
    }

    public static void main(String args[]){
        Toyota tyt = new Toyota();
        tyt.run();
    }
}