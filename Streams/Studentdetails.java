package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Students {
    int id;
    String name;
    int marks;

    Students(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}
public class Studentdetails {
    public static void main(String[] args){
        List<Students> student = Arrays.asList(
                new Students(01,"Mehathab",68),
                new Students(02,"Naziya",75),
                new Students(03,"Anees",58),
                new Students(05,"Amisha",34),
                new Students(04,"Anwar",92));
        student.stream()
                .filter(Students -> Students.marks >= 70 )
                .map(Students -> Students.name)
                .forEach(System.out::println);
// passes students
        long count = student.stream()
                .filter(Students -> Students.marks >= 35)
                .count();
        System.out.println(count);

//        sort students by marks
        student.stream()
                .sorted(Comparator.comparingInt(Students -> Students.marks))
                .forEach(System.out::println);

//        Find highest marks students
        Students topper = student.stream()
                .max(Comparator.comparingInt(Students -> Students.marks))
                .get();
        System.out.println(topper);
    }
}
