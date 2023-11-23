class Student{
    int id;
    String name;
}
public class ByReference {
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.id = 7;
        s1.name = "Thuyein";
        System.out.println(s1.id+" "+s1.name);

        Student s2 = new Student();
        s2.id = 100;
        s2.name = "Bob";
        System.out.println(s2.id+" "+s2.name);
    }
}
