import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class TabSet<E> implements Iterable<E>,Set<E> {
	private E[] tableau;
	
	@SuppressWarnings("unchecked")
	public TabSet() {
		this.tableau = (E[])new Object[10];
	}
	
	public boolean contains(Object o) {
		for(E e : tableau) {
			if(e == o) {
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		int size = 0;
		for(E e: tableau) {
			if(e != null) {
				size++;
			}
		}
		return size;
	}
	
	public boolean isEmpty() {
		return this.size()==0;
	}
	
	@SuppressWarnings("unchecked")
	public boolean add(E e) {
		if(this.size() == tableau.length) {
			int i = 0;
			Object[] res = new Object[this.size()*2];
			for(E e1 : tableau) {
				res[i] = e1;
				i++;
			}
			res[i] = e;
			this.tableau = (E[]) res;
			return true;
		}
		for(E e1: tableau) {
			if (e1 == e) {
				return false;
			}
		}
		TabIter it = new TabIter();
		it.add(e);
		return true;
	}
	
	public boolean remove(Object o) {
		if(this.contains(o)) {
			TabIter it = new TabIter();
			while(it.hasNext() && it.next() != o) {
				it.next();
			}
			it.remove();
			return true;
		}
		return false;
	}
	
	public void clear() {
		TabIter it = new TabIter();
		while(it.hasNext()) {
			it.next();
			it.remove();
		}
	}
	
	public boolean containsAll(Collection<?> c) {
		for(Object o : c) {
			if(!this.contains(o)) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c) {
		if(this.containsAll(c)) {
			return false;
		}
		for(E e : c) {
			this.add(e);
		}
		return true;
	}
	
	@Override
	public boolean removeAll(Collection<?> c) {
		TabIter it = new TabIter();
		while(it.hasNext()) {
			if(c.contains(it.next())) {
				it.remove();
			}
		}
		return true;
	}
	
	@Override
	public Iterator<E> iterator() {
		return new TabIter();
	}
	
	public class TabIter implements Iterator<E>{
		private int index = 0;

		@Override
		public boolean hasNext() {
			return index < tableau.length;
		}

		@SuppressWarnings("unchecked")
		@Override
		public E next() {
			E elem = (E) tableau[index];
			index++;
			return elem;
		}
		
		public void add(E e) {
			if(e == null) {
				throw new NullPointerException("La valeur est null !");
			}
			if(!this.hasNext()) {
				throw new IllegalStateException("Le tableau est plein !");
			}
			while(this.hasNext()) {
				if(this.next() == null) {
					tableau[index-1] = e;
					return;
				}
			}
		}
		
		public void remove() {
			if(index-1 < 0) {
				throw new IllegalStateException();
			}
			tableau[index-1] = null;
		}
		
	}

	@Override
	public Object[] toArray() {
		int i = 0;
		Object[] res = new Object[this.size()];
		for(E e : tableau) {
			if(e != null) {
				res[i] = e;
				i++;
			}
		}
		return res;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T[] toArray(T[] a) {
		if(a.length >= this.size()) {
			int i = 0;
			for(E e : tableau) {
				if(e != null) {
					a[i] = (T) e;
					i++;
				}
			}
			while(i < a.length) {
				a[i] = null;
				i++;
			}
		} else {
			Class<?> c = a.getClass().getComponentType();
			int i = 0;
			T[] t = (T[]) Array.newInstance(c, this.size());
			for(E e : tableau) {
				if(e != null) {
					t[i] = (T) e;
					i++;
				}
			}
			return t;
		}
		return a;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		TabIter it = new TabIter();
		while(it.hasNext()) {
			if(!c.contains(it.next())) {
				it.remove();
			}
		}
		return true;
	}

}
