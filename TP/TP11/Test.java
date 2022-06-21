import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		/*Integer[] n = {8,5,4,0};
		TestIter<Integer> t1 = new TestIter<Integer>(n);
		while(t1.hasNext()) {
			System.out.println(t1.next());
		}
		
		String[] s = {"salut","cv","oui",null,"et toi"};
		TestIter<String> t2 = new TestIter<String>(s);
		while(t2.hasNext()) {
			System.out.println(t2.next());
		}
		
		TabSet<Integer> t3 = new TabSet<Integer>(4);
		Iterator<Integer> n2 = t3.iterator();
		t3.add(8);
		t3.add(5);
		t3.add(4);
		t3.add(0);
		while(n2.hasNext()) {
			System.out.println(n2.next());
		}
		
		TabSet<String> t4 = new TabSet<String>(5);
		Iterator<String> s2 = t4.iterator();
		t4.add("salut");
		t4.add("cv");
		t4.add("oui");
		t4.add("et toi");
		t4.remove("oui");
		while(s2.hasNext()) {
			System.out.println(s2.next());
		}
		t4.clear();
		Iterator<String> s3 = t4.iterator();
		while(s3.hasNext()) {
			System.out.println(s3.next());
		}*/
		TabSet<Integer> t3 = new TabSet<Integer>();
		TabSet<Integer> t4 = new TabSet<Integer>();
		Iterator<Integer> n2 = t3.iterator();
		t3.add(8);
		t3.add(4);
		t3.add(5);
		t3.add(1);
		t4.add(2);
		t4.add(6);
		t4.add(9);
		t4.add(7);
		t4.add(10);
		t4.add(3);
		System.out.println(t3.containsAll(t4));
		t3.addAll(t4);
		t3.add(11);
		//t3.removeAll(t4);
		//t3.retainAll(t4);
		while(n2.hasNext()) {
			System.out.println(n2.next());
		}
		System.out.println("===");
		Object[] tab = t3.toArray();
		for(Object o : tab) {
			System.out.println(o);
		}
		System.out.println("===");
		Object[] tab2 = t4.toArray(tab);
		for(Object o : tab2) {
			System.out.println(o);
		}
	}

}
