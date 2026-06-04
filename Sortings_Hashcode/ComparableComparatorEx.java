package Sortings_Hashcode;

import java.util.*;

public class ComparableComparatorEx {


    public static void main(String[] args){

        List<ClgStudent> students = new ArrayList<>();

        students.add(new ClgStudent(108,"Mehathab",97));
        students.add(new ClgStudent(105,"Amisha",83));
        students.add(new ClgStudent(103,"Naziya",87));
        students.add(new ClgStudent(109,"Anees",92));

        Collections.sort(students);
        System.out.println(students);

        Comparator<ClgStudent> comparator = (s1,s2) -> s1.name.compareTo(s2.name);
        students.sort(comparator);
        System.out.println(students);

//        (s1,s2) -> Double.compare(e2.marks,e1.marks)

        ClgStudent s1 = new ClgStudent(101,"Anwar",99);
        ClgStudent s2 = new ClgStudent(101,"Rameez",97);

        System.out.println(s1.equals(s2));

        Set<ClgStudent> set = new HashSet<>();
        set.add(new ClgStudent(101,"Anwar",99));
        set.add(new ClgStudent(101,"Rameez",97));

        System.out.println(set.size());

    }

}
