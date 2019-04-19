package builder;

public class McDonaldsBuilder implements BurgerBuilder {

	private StringBuilder mcburger;

	@Override
	public void createNewBurger() {
		mcburger = new StringBuilder();
		
	}

	@Override
	public void buildBread() {
		mcburger.append(new Bread("Seesamsämpylä\n").toString());
	}

	@Override
	public void buildSauce() {
		mcburger.append(new Sauce("Ketsuppi\n").toString());
	}

	@Override
	public void buildPatty() {
		mcburger.append(new Patty("Jauhelihapihvi\n").toString());
	}

	@Override
	public void buildCheese() {
		mcburger.append(new Cheese("Sulatejuusto\n").toString());
	}
	
	@Override
	public Object getBurger() {
		return mcburger;
	}

}
