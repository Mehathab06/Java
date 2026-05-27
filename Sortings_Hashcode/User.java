package Sortings_Hashcode;
import java.util.Objects;

    public  class User implements Comparable<User> {
        int userId;
        String userName;

        public User(int userId, String userName){
            this.userId = userId;
            this.userName = userName;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass()) return false;
            User otherUser = (User) obj;
            return userId == otherUser.userId && Objects.equals(userName, otherUser.userName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(userId, userName);
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + userId +
                    ", name='" + userName + '\'' +
                    '}';
        }

        @Override
        public int compareTo(User otherUser) {
            return Integer.compare(this.userId, otherUser.userId);
        }
    }
