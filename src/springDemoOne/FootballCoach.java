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

	//add init method
	public void inicio() {
		System.out.println("Entro en inicio");
	}
	
	
	//add cleanup method
	public void fin() {
		System.out.println("Entro en fin");
	}

}
