package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain {
	
	private int honneur = 1;

	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		// TODO Auto-generated constructor stub
	}
	
	public void donner(int montant, Commercant commercant) {
		this.perdreArgent(montant);
		super.parler("Tiens le gueux voila " +montant+ " sous");
		commercant.recevoir(montant);
	}
	
	public void provoquer(Yakuza yakuza) {
		if (this.honneur * 2 > yakuza.getReputation()) {
			this.gagnerArgent(yakuza.perdreDuel());
			this.honneur++;
			super.parler("J'ai explosé "+yakuza.getNom());
		} else {
			yakuza.gagnerDuel();
			this.honneur--;
			super.parler("zebi j'ai perdu");
		}
	}

}
