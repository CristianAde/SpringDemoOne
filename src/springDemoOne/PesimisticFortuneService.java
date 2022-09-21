package springDemoOne;

public class PesimisticFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Half empty bottle";
	}

}
