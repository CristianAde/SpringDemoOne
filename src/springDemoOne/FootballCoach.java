package springDemoOne;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getWorkout() {
		return "Shoot 2 goals!";
	}

	@Override
	public String getDailyFortune() {
		return "Football: " + fortuneService.getFortune();
	}
	
}
