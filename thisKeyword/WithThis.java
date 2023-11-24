class Employee{
    int id;
    String name;
    float salary;

    Employee(int id, String name, float salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}

class TestThis2{
    public static void main(String args[]){
        Employee e1 = new Employee(1,"Aaa",10000f);
        Employee e2 = new Employee(2,"Mia",15000f);

        e1.display();
        e2.display();
    }
}