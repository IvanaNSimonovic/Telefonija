package tel;

public class Poruka extends Usluga{
	String tekst;
	
	
	public Poruka(Broj a, Broj b, String t) {
		super (a,b);
		tekst=t;
	}

	public boolean poslata() {
		if(getInic().isFiksni() || getPrim().isFiksni())
			return false;
		else return true;
	}
	public double cenaUsluge() {
		double cena=0;
		if (poslata()==true) {
		if(getInic().istaDrzava(getPrim())) cena=3;
		else cena=20;}
		
		return cena;
	}
	
	public String toString() {
		String s=super.toString()+tekst;
		return s;
	}
	
	

}
