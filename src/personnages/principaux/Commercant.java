package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, argent, "thé");
	}
	
	public int seFaireExtorquer() {
		int argentPerdu = this.getArgent();
		this.perdreArgent(argentPerdu);
		return argentPerdu;
	}
	
	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		super.parler("Merci seigneur merci");
	}
}
