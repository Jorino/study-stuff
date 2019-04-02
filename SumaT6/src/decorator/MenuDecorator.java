package decorator;

public abstract class MenuDecorator implements MenuIF {
	protected MenuIF menu;
	
	public MenuDecorator(MenuIF menu) {
		this.menu = menu;
	}
	
	
	public void printMenu() {
		menu.printMenu();
		}
	

}
