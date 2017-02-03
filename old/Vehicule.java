import java.util.ArrayList;
import java.util.List;

public class Vehicule {

	private int id = 0;
	//Stocke le prix
	private Double prix;
	//Stocke le nom
	private String nom;
	//Stocke la liste des options
	private List<Option> listOptions = new ArrayList<>();
	//Stocke le nom de la marque
	private String nomMarque;

	//Constructeur par défaut
	public Vehicule(int id, String nom, String nomMarque, double prix) {
		this.id = id;
		this.nom = nom;
		this.nomMarque = nomMarque;
		this.prix = prix;
	}
	
	//Constructeur avec paramètres
	public Vehicule(int id, String nom, String nomMarque, List<Option> lopt, double prix) {
		this.id = id;
		this.nom = nom;
		this.nomMarque = nomMarque;
		this.prix = prix;
		this.listOptions = lopt;
	}
	
	//*************   ACCESSEURS *************
	
	public String toString() {
		String str = marque + " : " + nom + " " + mot + " (" + this.prix
				+ "€) " + listOptions;
		str += " d'une valeur totale de " + getPrixTotal() + " €";
		return str;
	}

}
