class Boy{
    Boy(){
        System.out.println("Boy is created");
    }
}

class John extends Boy{
    John(){
        super();
        System.out.println("John is created");
    }
}

class TestSuper3{
    public static void main(String[] args) {
        John j = new John();
    }
}