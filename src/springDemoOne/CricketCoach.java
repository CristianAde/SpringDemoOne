package springDemoOne;

public class CricketCoach implements Coach {

	FortuneService fortuneService = null;
	
	
	
	public CricketCoach() {
		System.out.println("Inside default constructor of " + this.getClass());
	}

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
		System.out.println("Inside setter of " + this.getClass());
		
	}
	
}
