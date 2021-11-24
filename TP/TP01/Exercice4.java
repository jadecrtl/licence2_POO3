import java.util.Random;
import java.util.Scanner;


public class Exercice4 {
    
    public static int question() {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int a = rd.nextInt(10);
        int b = rd.nextInt(10);
        int res = a * b;
        int compte = 1;
        System.out.println("Combien font " + a + " * " + b);
        int val = sc.nextInt();
        if (val == res) {
            System.out.println("Bonne réponse!");
            return compte;
        }
        while (res != val) {
            System.out.println("Mauvaise réponse!");
            System.out.println("Combien font " + a + " * " + b);
            val = sc.nextInt();
            compte++;
        }
        System.out.println("Bonne réponse!");
        return compte;
    }

    public static int evaluation(int n) {
        Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int note = 20;
		
		for(int i=0; i<n; i++) {
			int a = rd.nextInt(10);
			int b = rd.nextInt(10);
			System.out.println("Combien font " + a + "*" + b + " ?");
			int res = sc.nextInt();
			if(res != a*b) {
				note--;
			}
		}
		return note;
    }



}
