class Employee {

    int id;
    String name;

    Employee(int i, String n){
        id = i;
        name = n;
    }

    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String args[]){
        Employee e1 = new Employee(11,"Aaa");
        Employee e2 = new Employee(22,"Bbb");

        e1.display();
        e2.display();
    }
}
