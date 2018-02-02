package banque;

public class LivretA extends Compte {
	
	@Override
	public int retirer(int i) {
		if(this.solde<i) {
			return 0;
		}else {
			this.solde -= i;
			return i;
		}
	}
	
	@Override
	public int virer(int somme, Compte c) {
		if(this.solde<i) {
			return 0;
		}else {
			this.retirer(somme);
			c.deposer(somme);
			return somme;
		}
	}
}
