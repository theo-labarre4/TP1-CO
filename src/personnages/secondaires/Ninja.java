package personnages.secondaires;

import personnages.principaux.Yakuza;

public class Ninja extends Yakuza {
	
	private String clanSecret;	
	private static final String[] clansNinja = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};


	public Ninja(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson, clan);
		this.affecterClanSecret();
		// TODO Auto-generated constructor stub
	}
	
	private void affecterClanSecret() {
		int rand = (int) Math.ceil(Math.random() * 5);
		this.clanSecret = clansNinja[rand-1];
	}

}
