public class NestedSwith {
    
    public static void main(String args[]){
        char branch='C';
        int collegeYear=3;
        switch(collegeYear){
            case 1 : System.out.println("English,Maths,Science");
            break;
            case 2 : switch(branch){
                case 'C': System.out.println("Operating System, Java, Data Structure");
                break;
                case 'E': System.out.println("Micro Processors, Logic switching theory");
                break;
                case 'M': System.out.println("Drawing, Manufacturing Machines");
                break;
            }
            break;
            case 3 : switch(branch){
                case 'C': System.out.println("Computer Organization, MultiMedia");
                break;
                case 'E': System.out.println("Fundamentals of Logic Design, Microelectronics");
                break;
                case 'M': System.out.println("Internal Combustion Engines, Mechinal Vibration");
                break;
            }
            break;
        }
    }
}
