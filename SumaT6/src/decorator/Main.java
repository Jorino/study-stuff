package decorator;

public class Main {
	public static void main(String[] args) {
		MenuIF m = new PaasynValvontaDecorator(new Menu());
		
		m.printMenu();

}
}
