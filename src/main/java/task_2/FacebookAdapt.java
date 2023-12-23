package task_2;

import java.time.LocalDate;

public class FacebookAdapt implements Client {
    private final FacebookUser user;

    public FacebookAdapt(FacebookUser facebookUser){
        user = facebookUser;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return user.getGetUserActiveTime();
    }
}

    @Override
    public String getCountry() {
        return user.getUserCountry().toString();
    }


