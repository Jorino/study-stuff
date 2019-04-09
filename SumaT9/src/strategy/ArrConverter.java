package strategy;

import java.util.List;

public class ArrConverter implements ListConverter{

	@Override
	public <E> String listToString(List<E> list) {
		Object[] array = list.toArray();
		StringBuilder strb = new StringBuilder();
		
		for(int i = 1 ; i < array.length + 1 ; i++) {
			strb.append(array[i-1] + ", ");
			if(i % 2 == 0) {
				strb.append("\n");
			}
		}
		return strb.toString();
	}

}
