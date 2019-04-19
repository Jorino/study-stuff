package builder;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		BurgerMaker mestarikokki = new BurgerMaker(new McDonaldsBuilder());
		mestarikokki.makeBurger();
		System.out.println("McBurger:\n" + mestarikokki.getBurger()+ "\n");
		
		
		mestarikokki.setBuilder(new HesburgerBuilder());
		mestarikokki.makeBurger();
		ArrayList<Object> heseburger = (ArrayList<Object>) mestarikokki.getBurger();
		System.out.println("Hesen burgeri:");
		Iterator<Object> itr = heseburger.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
	}
}
