package personnages.secondaires;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Samourai;

public class Traitre extends Samourai {
	
	private double niveauTraitrise = 0;

	public Traitre(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson, seigneur);
		// TODO Auto-generated constructor stub
	}
	
	public double getTraitrise() {
		return this.niveauTraitrise;
	}
	
	
	public void extorquer(Commercant commercant) {
		if (this.niveauTraitrise < 3) {
			commercant.seFaireExtorquer();
			this.niveauTraitrise++;
			super.parler("Je viens d'extorquer "+commercant.getNom()+ " !");
		} else {
			super.parler("Je suis trop un traitre pour extorquer");
		}
	}
	
	public void faireLeGentil(Humain humain, int argent) {
		humain.gagnerArgent(argent);
		this.perdreArgent(argent);
		this.niveauTraitrise -= argent / 10;
		if (this.niveauTraitrise < 0) {
			this.niveauTraitrise = 0;
		}
	}
	
	public void direBonjour() {
		super.parler("Bonjour ! Je m'appelle " 
				+this.getNom()+ ", je suis un traitre de niveau " 
				+this.getTraitrise()
				+ " et j'aime boire du" +this.getBoisson());
	}
}
