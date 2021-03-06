package Strategy;

import java.util.List;

public class BetaPrice implements IPricingStrategy {

	@Override
	public double execute(List<Double> itemsList) {
		double price = 0;
		for (double p : itemsList)
			price += p;
		return price * 0.9;
	}

}
