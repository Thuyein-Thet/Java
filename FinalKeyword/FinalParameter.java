class Car{
    int cube(final int n){
        n = n+2;
        n*n*n;
    }

    public static void main(String args[]){
        Car c = new Car();
        c.cube(5);
    }
}