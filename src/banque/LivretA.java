package banque;

public class LivretA extends Compte {
	
	public LivretA() {
		this.solde = 0;
	}
	
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
		if(this.solde<somme) {
			return 0;
		}else {
			this.retirer(somme);
			c.deposer(somme);
			return somme;
		}
	}
	
	public static void main(String[] args) {
		LivretA comptea = new LivretA();
		LivretA compteb = new LivretA();
		comptea.deposer(1000);
		System.out.println(comptea.toString());
		comptea.retirer(250);
		System.out.println(comptea.toString());
		comptea.retirer(1000);
		System.out.println(comptea.toString());
		comptea.virer(250, compteb);
		System.out.println(" Compte A "+comptea.toString());
		System.out.println(" Compte B "+compteb.toString());
		comptea.virer(1000, compteb);
		System.out.println(" Compte A "+comptea.toString());
		System.out.println(" Compte B "+compteb.toString());
	}
}
