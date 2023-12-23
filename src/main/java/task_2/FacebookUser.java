package task_2;

import lombok.Getter;
import lombok.AllArgsConstructor;


import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class FacebookUser {
    private String email;
    private Country userCountry;
    private LocalDate getUserActiveTime;
}
