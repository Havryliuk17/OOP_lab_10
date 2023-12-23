package task1;

import task_1.ForUser;

public class MainWork {
    public static void main(String[] args) {
        User user1 = new User("Olha", "havryliuk@gmail.com", 18);
        user1.save();
        User user2 = new User("Marta", "Khima@gmail.com", 23);
        user2.save();
    }
}