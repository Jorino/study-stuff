package strategy;

import java.util.List;

public class ListGetConverter implements ListConverter{

	@Override
	public <E> String listToString(List<E> list) {
		StringBuilder strb = new StringBuilder();
		
		for(int i = 0; i < list.size(); i++) {
			strb.append(list.get(i) + ", ");
			
			//first index in the list is 0, so at 3 there would be 4 elements on the first row, therefore the plus one
			if((i+1) % 3 == 0) {
				strb.append("\n");
			}
		}
		return strb.toString();
	}

}
