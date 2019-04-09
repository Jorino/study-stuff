package strategy;

import java.util.Iterator;
import java.util.List;

public class ItrConverter implements ListConverter {

	@Override
	public <E> String listToString(List<E> list) {
		StringBuilder strb = new StringBuilder();
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext()) {
			strb.append(iterator.next().toString()+ ", " + "\n");
		}
		
		return strb.toString();
	}

}
