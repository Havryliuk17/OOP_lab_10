package task_2;

import java.time.LocalDate;

public class UserLogin {
    public static Client login(LoginMethod loginMethod) {
        if (loginMethod == LoginMethod.Twitter) {
            return new TwitterAdapter(new TwitterUser("havryliuk@gmail.com", "USA", "2022-11-21"));
        } else if (loginMethod == LoginMethod.Facebook) {
            return new FacebookAdapter(new FacebookUser("havryliuk@gmail.com", Country.USA, LocalDate.now()));
        }
        throw new IllegalArgumentException("No such loginMethod");
    }
}