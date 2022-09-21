package springDemoOne;

public class CricketCoach implements Coach {

	FortuneService fortuneService = null;
	
	@Override
	public String getWorkout() {
		return "Play 1h Cricket";
	}

	@Override
	public String getDailyFortune() {
		return "Cricket fortune" + fortuneService.getFortune();
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
}
