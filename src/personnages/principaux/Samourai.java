package personnages.principaux;

public class Samourai  extends Ronin {
	
	private String seigneur;

	public Samourai(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson);
		this.seigneur = seigneur;
		// TODO Auto-generated constructor stub
	}
	

	public String getSeigneur() {
		return seigneur;
	}
	
	public void boire(String boisson) {
		super.parler("Mmmm, un bon verre de " + boisson +" ! GLOUPS! ");

	}
	
	@Override
	public void direBonjour() {
		super.parler("Bonjour ! Je m'appelle " 
				+this.getNom()+ ", je sers le seigneur " 
				+this.getSeigneur()
				+ " et j'aime boire du" +this.getBoisson());
	}


}
