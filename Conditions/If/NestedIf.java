package If;
public class NestedIf {
    
    public static void main(String args[]){
        int age=25;
        int weight=68;

        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            }else{
                System.out.println("You are not eligible to donate blood");
            }
        }else{
            System.out.println("You are not eligible to donate blood");
        }
    }
}
