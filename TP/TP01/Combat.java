public class Combat {
    public static void main(String[] args) {
	/*	Informations a = new Informations(500,500,500);
		Informations b = new Informations(400,800,600);
        System.out.println(a.toString());
        System.out.println(b.toString());
		Personnage p = new Personnage("Arthur",a,a);
		Personnage p2 =	new Personnage("Lancelot",b,b);
		
		p.lutte(p2);*/
		String s = "git log --after='2021-11-14 00:00' --before='2021-11-14 00:00'";
		System.out.println(argLength(s));

    }
	public static int argLength(String s){
		int length = 0;
		int accumulator = 0;
		while(s.charAt(accumulator) != '=' || s.length() == accumulator){
			accumulator++;
		}
		System.out.println(accumulator);
		int nbrSpace = 2;
		for(int j = accumulator+1;j<s.length()-1;j++){
			if(s.charAt(j) == ' '){
				nbrSpace--;
			}
			if(nbrSpace == 0) {
				System.out.println(s.substring(0,j));
				return length;
			}
			length++;
		}
		return length;
	}

}
