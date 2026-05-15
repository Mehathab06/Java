package Inheritance;
class School{
    String schoolName;

    void displayName(){
        System.out.println("school Name: " + schoolName);
    }
}
class Teacher extends School{
    String subject;

    void displaySubject(){
        System.out.println("subject: " + subject);
    }
}
class MathTeacher extends Teacher{
    String TechName;

    void displayTechName(){
        System.out.println("Maths Teacher name: " + TechName);
    }

}
public class MultilevelInheritance {
    public static void main(String[] args){
        MathTeacher t1 = new MathTeacher();

        t1.schoolName = "Holy angles e.m school";
        t1.subject = "Maths";
        t1.TechName = "Ramesh sir";


        t1.displayName();
        t1.displaySubject();
        t1.displayTechName();
    }
}
