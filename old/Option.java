import java.io.Serializable;

public interface Option {
	int id = 0;
	String nom = "";
	double prix = 0d;

	public Option(int id, String nom, double prix) {
		this.id = id;
		this.nom = nom;
		this.prix = prix;
	}
}
