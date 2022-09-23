package springDemoOne;

import org.springframework.beans.factory.DisposableBean;

public class CricketCoach implements Coach, DisposableBean {

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

	public void onInstantiation() {
		System.out.println("Inside onInstantiation");
	}
	public void onDestroy() {
		System.out.println("Inside onDestroy");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy");
		
	}
	
}
