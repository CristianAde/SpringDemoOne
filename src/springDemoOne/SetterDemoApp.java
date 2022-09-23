package springDemoOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load Spring config file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve object from Spring object container

		CricketCoach myCoach = context.getBean("myCricketCoach", CricketCoach.class);

		// use the objects
		System.out.println(myCoach.getWorkout());
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myCoach.getEmail());
		System.out.println(myCoach.getTeam());
		

		// close the Spring context
		context.close();

	}

}
