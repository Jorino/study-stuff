package strategy;

import java.util.List;

public interface ListConverter {
	public <E> String listToString(List<E> list);
}
