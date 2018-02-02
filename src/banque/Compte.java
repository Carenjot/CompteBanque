package banque;

public class Compte {
	public int solde;
	
	public Compte() {
		this.solde = 0;
	}
	
	public void deposer(int i) {
		this.solde += i;
	}
	
	public int retirer(int i) {
		this.solde -= i;
		return i;
	}
	
	public int virer(int somme, Compte c) {
		this.retirer(somme);
		c.deposer(somme);
		return somme;
	}
	
	
	@Override public String toString() {  return " Solde : "+this.solde ; } 
	 
	
	public static void main(String[] args) {
		Compte comptea = new Compte();
		Compte compteb = new Compte();
		comptea.deposer(500);
		System.out.println(comptea.toString());
		comptea.retirer(250);
		System.out.println(comptea.toString());
		comptea.virer(100, compteb);
		System.out.println("Compte A " + comptea.toString());
		System.out.println("Compte B " + compteb.toString());

	}

}
