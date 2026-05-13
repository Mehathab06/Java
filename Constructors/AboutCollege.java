package Constructors;

class College1{
    String collegeName;
    String location;

    College1(String collegeName, String location){
        this.collegeName = collegeName;
        this.location = location;

    }
}
class Department extends College1{
    String departmentName;
    String HodName;

    Department(String collegeName, String location,String departmentName, String HodName){
        super(collegeName,location);
        this.departmentName = departmentName;
        this.HodName = HodName;
    }

    void displayDetails(){
        System.out.println("College name : "+ collegeName);
        System.out.println("location: " +  location);
        System.out.println("departmentName: " + departmentName);
        System.out.println("HodName: " + HodName);
    }


}

public class AboutCollege {
    public static void main(String[] args){
        Department d1 = new Department("Geethanjali","Nellore","ECE","Ramesh");
        d1.displayDetails();
    }
}
