package springDemoOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScopeApplicationContext.xml");

		Coach coach = context.getBean("myCoach", Coach.class);
		Coach otherCoach = context.getBean("myCoach", Coach.class);
		System.out.println(coach.equals(otherCoach) + "/" + coach + "/" + otherCoach);
		context.close();
	}

}
