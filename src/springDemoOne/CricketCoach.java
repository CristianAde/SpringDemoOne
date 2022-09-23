package springDemoOne;

public class CricketCoach implements Coach {

	FortuneService fortuneService = null;
	String email = "";
	String team = "";

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		System.out.println("Inside setEmail");
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("Inside setTeam");
	}

	
	
}
