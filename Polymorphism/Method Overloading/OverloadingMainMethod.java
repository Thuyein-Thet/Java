class TestOverloading3{
    
    public static void main(){
        System.out.println("Main without args");
    }

    public static void main(String args){
        System.out.println("Main with String");
    }

    public static void main(String aargs[]){
        System.out.println("Main with String []");
    }
    
}