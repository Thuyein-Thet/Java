class Pupil{
    int rollno;
    String name,course;
    float fee;

    Pupil(int rollno, String name, String course){
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    Pupil(int rollno, String name, String course, float fee){
        this(rollno,name,course);// Rule: Call to this() must be the first statement in constructor.
        this.fee = fee;
    }

    void display(){
        System.out.println(rollno+" "+name+" "+course+" "+fee);
    }
}

class TestThis5{
    public static void main(String args[]){
        Pupil p1 = new Pupil(1,"Mg Mg","Java");
        Pupil p2 = new Pupil(2,"Ko Ko","PHP",6000f);
    
        p1.display();
        p2.display();
    }
}