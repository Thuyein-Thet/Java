class Employee{
    int id;
    String name;
    float salary;
    void insert(int i, String n, float s){
        id = i;
        name = n;
        salary = s;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}

public class ByMethod2 {
    public static void main(String args[]){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();   

        e1.insert(1, "Aaa", 10000);
        e2.insert(2, "Bbb", 20000);
        e3.insert(3, "Ccc", 15000);

        e1.display();
        e2.display();
        e3.display();
    }
}
