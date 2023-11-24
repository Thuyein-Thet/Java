class Z{
    Z getZ(){
        return this;
    }

    void msg(){
        System.out.println("Hello Java");
    }
}

class Test{
    public static void main(String args[]){
        new Z().getZ().msg();
    }
}