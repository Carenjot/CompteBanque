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
	
}
