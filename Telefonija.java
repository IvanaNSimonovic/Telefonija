package tel;

import java.util.LinkedList;

public class Telefonija {
	
	public static void main(String[] args) {
		
		Broj a = new Broj ("381", "62", "123456", false);
		Broj b = new Broj ("381", "63", "123456", false);
		
		
		Poziv p= new Poziv(a,b, 125);
		Poziv p2= new Poziv(b,a,100);
		
		Korisnik k1= new Korisnik(a);
		k1.getUsluge().add(p);
		
		LinkedList<Usluga> l = new LinkedList<Usluga>();
		l.add(p);
		l.add(p2);
		
		Korisnik k2= new Korisnik(b, l);
		
		System.out.println(p);
		
		
	}

}
