package Sortings_Hashcode;

public class ClgStudent implements Comparable<ClgStudent>{
    int rollNo;
    String name;
    double marks;

    ClgStudent(int rollNo,String name,double marks){
        this.rollNo =rollNo;
        this.name = name;
        this.marks = marks;
    }
//    Comparable
    @Override
    public int compareTo(ClgStudent s){
        return this.rollNo - s.rollNo;
    }

//    equals
    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if(!(obj instanceof ClgStudent))
            return false;

        ClgStudent s = (ClgStudent) obj;
        return this.rollNo == s.rollNo;
    }

//  hashcode
    @Override
    public int hashCode(){
        return Integer.hashCode(rollNo);
    }

    @Override
    public String toString(){
        return rollNo + name + marks;
    }
}
