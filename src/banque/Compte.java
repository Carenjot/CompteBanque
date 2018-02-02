package banque;

public class Compte {
	private int solde;
	
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
		

	}

}
