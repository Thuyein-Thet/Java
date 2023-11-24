class Student {
    
    int rollno;
    String name;
    static String college = "ITS";

    static void change(){
        college = "BBDIT";
    }

    Student(int r, String n){
        rollno = r;
        name = n;
    }

    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}

public class StaticMethod{
    public static void main(String args[]){
        Student.change();

        Student s1 = new Student(1,"Bob");
        Student s2 = new Student(2,"Kia");
        Student s3 = new Student(3,"John");

        s1.display();
        s2.display();
        s3.display();
    }
}