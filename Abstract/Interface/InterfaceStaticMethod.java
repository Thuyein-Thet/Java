interface Drawable{
    void draw();

    static int cube(int x){
        return x*x*x;
    }
}

class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}

class TestInterface4{
    public static void main(String[] args) {
        Drawable d = new Rectangle();
        d.draw();
        System.out.println("Cube : "+Drawable.cube(5));
    }
}