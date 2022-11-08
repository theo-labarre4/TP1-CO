package personnages;

public class Humain {
	
	private String nom;
	
	private int argent;
	
	private String boisson;
	
	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	public void parler(String texte) {
		System.out.println("(" + this.nom + ") - " + texte);
	}
	
	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle "
				+  this.nom +
				" et j'aime boire du "
				+ this.boisson);
	}

	public void boire() {
		this.parler("Mmmm, un bon verre de " +this.boisson +" ! GLOUPS! ");
	}

	public int getArgent() {
		return argent;
	}

	public String getBoisson() {
		return boisson;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int gagnerArgent(int gain) {
		return this.argent += gain;
	}
	
	public int perdreArgent(int perte) {
		return this.argent -= perte;
	}

}
