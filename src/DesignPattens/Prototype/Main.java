package DesignPattens.Prototype;

public class Main {
    public static void main(String[] args) {
        //clone teacher
        Teacher teacher = new Teacher("Amrrrrr","DesignPatterns");
        Teacher teacherClone = (Teacher)teacher.clone();
        System.out.println("teacherCloned name:" + teacherClone.getName()+"\nteacherClone course: " + teacherClone.getCourse());

        //clone student1
        Student student1 = new Student("foulla",teacherClone);
        Student studentClone1 = (Student)student1.clone();
        System.out.println("\ncloneStudent\nstudent name:" + studentClone1.getName()+
                " enrolled in " +
                studentClone1.getTeacher().getName()+
                "'s course");

        //change teacher name
        teacherClone.setName("Damarany-changed");
        System.out.println("\nstudent name:" + studentClone1.getName()+" enrolled in " + studentClone1.getTeacher().getName()+"'s course");
        //shallowClone : if you make change in teacherClone it will affect on studentClone1.getTeacher(),,
        //               the 2 object will include same data
        //               but different place in memory

        //deepClone: if you make change in teacherClone it will not affect on studentClone1.getTeacher(),,
        //          the 2 object will include different data
        System.out.println(studentClone1.getTeacher().getName()+ " ****************"  );

        System.out.println(teacherClone.getName()+ " ****************");

    }



}
