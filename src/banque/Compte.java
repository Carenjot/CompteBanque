package banque;

public class Compte {
	private int solde;
	
	public Compte() {
		this.solde = 0;
	}
	
	public void deposer(int i) {
		this.solde += i;
	}
	
	public void retirer(int i) {
		this.solde -= i;
	}
	
	public int virer(int somme, Compte c) {
		this.retirer(somme);
		c.deposer(somme);
		return somme;
	}
	
	public static void main(String[] args) {
		

	}

}
