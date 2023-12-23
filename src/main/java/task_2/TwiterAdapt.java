package task_2;

import java.time.LocalDate;

public class TwitterAdapt implements Client {
    private final TwitterUser user;

    public TwitterAdapt(TwitterUser twitterUser){
        user = twitterUser;
    }
    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return LocalDate.parse(user.getLastActiveTime());
    }
}
