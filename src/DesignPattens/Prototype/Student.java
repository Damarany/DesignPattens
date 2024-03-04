package DesignPattens.Prototype;
//concretPrototype2
public class Student extends Person{

    private Teacher teacher;

    protected Student(String name,Teacher teacher) {
        super(name);
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public Student clone(){
        Student studentClone = (Student) super.clone();
        studentClone.setTeacher(new Teacher(studentClone.getTeacher().getName(),studentClone.getTeacher().getCourse()));
        return studentClone;
    }
}
