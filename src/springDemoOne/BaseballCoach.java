package springDemoOne;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach() {
	}

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getWorkout() {
		return "Do 2 homeruns!";
	}

	@Override
	public String getDailyFortune() {
		return "Baseball: " + fortuneService.getFortune();
	}
	
}
