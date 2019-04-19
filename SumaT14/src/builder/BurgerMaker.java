package builder;

public class BurgerMaker {

	private BurgerBuilder builder;
	
	public BurgerMaker(BurgerBuilder builder) {
		this.builder = builder;
	}
	
	public void setBuilder(BurgerBuilder builder) {
		this.builder = builder;
	}
	
	public void makeBurger() {
		builder.createNewBurger();
		builder.buildBread();
		builder.buildCheese();
		builder.buildPatty();
		builder.buildSauce();
	}
	
	public Object getBurger() {
		return builder.getBurger();
	}
}
