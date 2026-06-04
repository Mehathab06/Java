package Sortings_Hashcode;

import java.util.*;

class Employee{
    int id;
    String name;

    Employee(int id,String name){
        this.id = id;
        this.name = name;

    }
    @Override
    public int hashCode(){
        return id;
    }
}
public class OverrideHashCode {
    public static void main(String[] args){
        Employee e1 = new Employee(11,"Mehathab");
        Employee e2 = new Employee(12,"Anwar");

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

    }
}

//package Sortings_Hashcode;
//import java.util.*;
//public class Test extends User {
//
//    public Test(int userId, String userName) {
//        super(userId, userName);
//    }
//
//    public static void main(String[] args) {
//        int firstNum = 10;
//        int secondNum = 20;
//        if (firstNum == secondNum) {  //(==)method compares memory address.
//            System.out.println("X and Y are equal");
//        } else {
//            System.out.println("X and Y are not equal");
//        }
//
//
//        User primaryUser = new User(101, "Mehathab");
//        User secondaryUser = new User(102, "Anwar");
//        if (primaryUser.equals(secondaryUser)) {     //(.equlas) method  compares content based on id.
//            System.out.println("Both users are same");
//        } else {
//            System.out.println("Both users are not same");
//        }
//
//        Set<User> uniqueUsers = new HashSet<>();
//        uniqueUsers.add(primaryUser);
//        uniqueUsers.add(secondaryUser);
//        System.out.println("userset size is :" +uniqueUsers.size());
//
//        Set<Integer> uniqueNumbers = new HashSet<>();
//        uniqueNumbers.add(10);
//        uniqueNumbers.add(10);
//        System.out.println("integerset size is :" +uniqueNumbers.size());
//
//        Map<Integer,User> userMap = new HashMap<>();
//        userMap.put(1,primaryUser);
//        userMap.put(1,secondaryUser);
//        System.out.println("Map size is :" +userMap.size());
//
//        List<Integer> numberList = new ArrayList<>();
//        numberList.add(40);
//        numberList.add(26);
//        numberList.add(12);
//        Collections.sort(numberList);
//        System.out.println("sorted list is :" +numberList);
//
//        List<User> folksList = new ArrayList<>();
//        folksList.add(primaryUser);
//        folksList.add(primaryUser);
//        //    Collections.sort(folksList,Comparator.comparing(user -> user.id));
//        Collections.sort(folksList);
//        System.out.println("sorted user list is :" +folksList);
//    }
//}
//

//package Sortings_Hashcode;
//import java.util.Objects;
//
//public  class User implements Comparable<User> {
//    int userId;
//    String userName;
//
//    public User(int userId, String userName){
//        this.userId = userId;
//        this.userName = userName;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null || getClass() != obj.getClass()) return false;
//        User otherUser = (User) obj;
//        return userId == otherUser.userId && Objects.equals(userName, otherUser.userName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(userId, userName);
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + userId +
//                ", name='" + userName + '\'' +
//                '}';
//    }
//
//    @Override
//    public int compareTo(User otherUser) {
//        return Integer.compare(this.userId, otherUser.userId);
//    }
//}
