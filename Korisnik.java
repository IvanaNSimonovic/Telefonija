package tel;

import java.util.LinkedList;

public class Korisnik {
	
	private Broj b;
	private LinkedList<Usluga> usluge;
	
	
	public Korisnik(Broj x, LinkedList<Usluga> listaUsluga) {
		b=x;
		usluge=listaUsluga;
		}
	
	public Korisnik(Broj b) {
		this.b=b;
		usluge= new LinkedList<Usluga>();
		}

	public Broj getB() {
		return b;
	}

	public void setB(Broj b) {
		this.b = b;
	}

	public LinkedList<Usluga> getUsluge() {
		return usluge;
	}

	public void setUsluge(LinkedList<Usluga> usluge) {
		this.usluge = usluge;
	}
	
	

}
