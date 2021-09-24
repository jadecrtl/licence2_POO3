import java.util.Random;
import java.util.Scanner;

public class exo4 {
	
	public int question() {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int x = rd.nextInt(10);
		int y = rd.nextInt(10);
		int cpt = 1;
		
		System.out.println("Combien font "+x+"*"+y+" ?");
		int res = sc.nextInt();
		if(res == x*y) {
			System.out.println("Bonne réponse !");
			return cpt;
		}
		while(res != x*y) {
			System.out.println("Combien font "+x+"*"+y+" ?");
			res = sc.nextInt();
			cpt++;
		}
		System.out.println("Bonne réponse !");
		return cpt;
		
	}
	
	public int evaluation(int n) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int note = 20;
		
		for(int i=0 ; i < n;i++) {
			int x = rd.nextInt(10);
			int y = rd.nextInt(10);
			System.out.println("Combien font "+x+"*"+y+" ?");
			int res = sc.nextInt();
			if(res != x*y) {
				note--;
			}
		}
		
		return note;
	}
	
	public static void main(String[] args) {
		exo4 a = new exo4();
		//System.out.println(a.question());
		System.out.println("Votre note est "+a.evaluation(7)+"/20");
	}
}
