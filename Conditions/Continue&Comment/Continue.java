public class Continue {
    
    public static void main(String args[]){
        first: for(int i=1;i<=3;i++){
            second: for(int j=1;j<=3;j++){
                if(j==2 && i==2){
                    continue first;
                }
                System.out.println(i+""+j);
            }
        }
    }

/* Sample of multiline comment
Sample of multiline comment
Sample of multiline comment
Sample of multiline comment
Sample of multiline comment
Sample of multiline comment */


}
