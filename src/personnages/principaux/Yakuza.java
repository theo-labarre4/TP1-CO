package personnages.principaux;

import personnages.Humain;

public class Yakuza extends Humain {
	
	private String clan;
	
	private int reputation = 0;
	
	public Yakuza(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan = clan;
		// TODO Auto-generated constructor stub
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant commercant) {
		commercant.seFaireExtorquer();
		this.reputation++;
		super.parler("Je viens d'extorquer "+commercant.getNom()+ " !");
	}
	
	public void gagnerDuel() {
		this.reputation++;
		super.parler("Je viens de gagner mon duel !");
	}
	
	public int perdreDuel() {
		reputation--;
		int argentPerdu = this.getArgent();
		this.perdreArgent(argentPerdu);
		super.parler("J'ai perdu mon duel et mes " +argentPerdu+ " sous...");
		return argentPerdu;
	}
	
	@Override
	public void direBonjour() {
		super.parler("Bonjour ! Je m'appelle " 
				+this.getNom()+ ", je fais parti du clan " 
				+this.getClan()
				+ " et j'aime boire du" +this.getBoisson());
	}
	
	

}
