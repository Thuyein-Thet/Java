class Calculate{
    static int cube(int i){
        return i*i*i;
    }

    public static void main(String args[]){
        int result = Calculate.cube(5);
        System.out.println(result);
    }
}