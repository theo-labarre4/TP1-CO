package personnages.secondaires;

import personnages.Humain;

public class GrandMere extends Humain {
	
	private Humain[] memoire = new Humain[30];

	public GrandMere(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		// TODO Auto-generated constructor stub
	}
	
	private String humainHasard() {
		int rand = (int) Math.ceil(Math.random() * 4);
		switch (rand) {
			case 1:
				return "Commercant";
			case 2:
				return "Ronin";
			case 3:
				return "Samourai";
			case 4:
				return "Yakuza";
			default:
				return "Humain";
		}
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		if (this.memoire[29] != null) {
			this.memoire[this.memoire.length-1] = humain;
			super.parler("J'ai fais connaissance avec " +humain.getNom()+
					" qui est un " +humain.getClass().getName());
		}
	}
	
	public void ragoter() {
		for (Humain h : this.memoire) {
			String nomClasse = h.getClass().getName();
			if (nomClasse.equals("Traitre")) {
				System.out.println("Je sais que " +h.getNom()+ " est un traitre !");
			} else {
				System.out.println("Je crois que " +h.getNom()+ " est un " + this.humainHasard());
			}
		}
	}

}
