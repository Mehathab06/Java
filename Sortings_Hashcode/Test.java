package Sortings_Hashcode;
import java.util.*;
public class Test extends User {

    public Test(int userId, String userName) {
        super(userId, userName);
    }

    public static void main(String[] args) {
            int firstNum = 10;
            int secondNum = 20;
            if (firstNum == secondNum) {  //(==)method compares memory address.
                System.out.println("X and Y are equal");
            } else {
                System.out.println("X and Y are not equal");
            }


            User primaryUser = new User(101, "Mehathab");
            User secondaryUser = new User(102, "Anwar");
            if (primaryUser.equals(secondaryUser)) {     //(.equlas) method  compares content based on id.
                System.out.println("Both users are same");
            } else {
                System.out.println("Both users are not same");
            }

            Set<User> uniqueUsers = new HashSet<>();
            uniqueUsers.add(primaryUser);
            uniqueUsers.add(secondaryUser);
            System.out.println("userset size is :" +uniqueUsers.size());

            Set<Integer> uniqueNumbers = new HashSet<>();
            uniqueNumbers.add(10);
            uniqueNumbers.add(10);
            System.out.println("integerset size is :" +uniqueNumbers.size());

            Map<Integer,User> userMap = new HashMap<>();
            userMap.put(1,primaryUser);
            userMap.put(1,secondaryUser);
            System.out.println("Map size is :" +userMap.size());

            List<Integer> numberList = new ArrayList<>();
            numberList.add(40);
            numberList.add(26);
            numberList.add(12);
            Collections.sort(numberList);
            System.out.println("sorted list is :" +numberList);

            List<User> folksList = new ArrayList<>();
            folksList.add(primaryUser);
            folksList.add(primaryUser);
            //    Collections.sort(folksList,Comparator.comparing(user -> user.id));
            Collections.sort(folksList);
            System.out.println("sorted user list is :" +folksList);
        }
    }
