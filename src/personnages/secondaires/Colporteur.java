package personnages.secondaires;

import personnages.principaux.Commercant;

public class Colporteur extends Commercant {

	public Colporteur(String nom, int argent) {
		super(nom, argent);
		// TODO Auto-generated constructor stub
	}
	
	
	public int seFaireExtorquer() {
		int argentPerdu =(int) this.getArgent() / 2;
		this.perdreArgent(argentPerdu);
		super.parler("hehehe...");
		return argentPerdu;
	}

}
