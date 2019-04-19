package builder;

public interface BurgerBuilder {
	
	public Object getBurger();
	
	public void createNewBurger();
	
	public void buildBread();
	public void buildSauce();
	public void buildPatty();
	public void buildCheese();

}
