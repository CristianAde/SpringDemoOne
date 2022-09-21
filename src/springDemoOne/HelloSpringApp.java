package springDemoOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from the container
		Coach thisCoach = context.getBean("myCoach", Coach.class);

		// use the methods from the bean
		System.out.println(thisCoach.getWorkout());
		System.out.println(thisCoach.getDailyFortune());
		
		// close the context
		context.close();
		
	}

}
