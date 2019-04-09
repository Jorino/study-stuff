package strategy;

import java.util.List;

public class Customer {
	
	private ListConverter conv;
	
	public Customer() {
		
	}
	
	public Customer(ListConverter converter) {
		this.conv = converter;
	}
	
	public void setConverter(ListConverter converter) {
		this.conv = converter;
	}
	
	public <E> String converter(List<E> list) {
		return conv.listToString(list);
	}

}
