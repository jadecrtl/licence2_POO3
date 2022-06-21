import java.util.Iterator;

public class TestIter<E> implements Iterator<E> {
	private E[] tableau;
	private int index = 0;
	
	public TestIter(E[] tab){
		this.tableau = tab;
	}
	
	@Override
	public boolean hasNext() {
		return index < tableau.length && tableau[index] != null;
	}

	@Override
	public E next() {
		E elem = tableau[index];
		index++;
		return elem;
	}

}
