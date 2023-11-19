public class NestedFor {

    public static void main(String args[]){
        int term=1;
        for(int i=6;i>=term;i--){
            for(int j=term;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
