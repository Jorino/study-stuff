package strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		List<Integer> scores = new ArrayList<>();
		Random rand = new Random();
		
		for(int i = 0 ; i < 10 ; i++) {
			scores.add(rand.nextInt(100) + 1);
		}
		
		customer.setConverter(new ItrConverter());
		System.out.println("Iterator:\n"+ customer.converter(scores));
		System.out.println();
		
		customer.setConverter(new ArrConverter());
		System.out.println("Array:\n" + customer.converter(scores));
		System.out.println();
		
		customer.setConverter(new ListGetConverter());
		System.out.println("Get:\n" + customer.converter(scores));

	}

}
