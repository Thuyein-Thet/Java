class Operation{
    int square(int n){
        return n*n;
    }
}

class Circle{
    Operation op;
    double pi=3.14;

    double area(int radius){
        op = new Operation();
        int square = op.square(radius);
        return pi*square;
    }

    public static void main(String args[]){
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
    }
}

