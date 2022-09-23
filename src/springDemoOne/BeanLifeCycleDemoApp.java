package springDemoOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifecycleApplicationContext.xml");
		Coach coach = context.getBean("myCoach", FootballCoach.class);
		System.out.println(coach.getWorkout());
		context.close();
	}

}
