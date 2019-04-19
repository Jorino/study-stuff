package builder;

import java.util.ArrayList;
import java.util.List;

public class HesburgerBuilder implements BurgerBuilder {

	private List<Object> heseburger;

	@Override
	public void createNewBurger() {
		heseburger = new ArrayList<Object>();
	}

	@Override
	public void buildBread() {
		heseburger.add(new Bread("Kokojyväleipä"));
	}

	@Override
	public void buildSauce() {
		heseburger.add(new Sauce("Majoneesi"));
	}

	@Override
	public void buildPatty() {
		heseburger.add(new Patty("Kokolihapihvi"));
	}

	@Override
	public void buildCheese() {
		heseburger.add(new Cheese("Cheddar-jalapeno juusto"));
	}
	
	@Override
	public Object getBurger() {
		return heseburger;
	}

}
