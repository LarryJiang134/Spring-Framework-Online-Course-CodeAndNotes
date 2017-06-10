package com.larry.springdemo;

/**
 * Created by hangyanjiang on 2017/6/8.
 */
public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    // define a constructor for dependency injection
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    // destroy method
    private void doMyCleanupStuff() {
        System.out.println("TrackCoach: inside method doMyCleanupStuff");
    }

}
