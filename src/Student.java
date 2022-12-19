public class Student extends Person{
    public int course;
    public Student (int h, int course){
        super(h);
        this.course = course;
    }
    void tell () {
        System.out.println(super.height);
        System.out.println(course);
    }
}
