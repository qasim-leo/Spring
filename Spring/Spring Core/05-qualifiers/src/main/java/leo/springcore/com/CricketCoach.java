package leo.springcore.com;

import org.springframework.stereotype.Component;

@Component // Marks as bean
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 15 minutes!!!!";
    }
}
