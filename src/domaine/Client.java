package domaine;

public class Client extends Personne {
	private String adresse;
	private int codepostale;
	private String ville;
	private int codebanque;

	public Client(int id, String nom, String prenom, int telephone, String adresse, int codepostale, String ville,
			int codebanque) {
		super(id, nom, prenom, telephone);
		this.adresse = adresse;
		this.codepostale = codepostale;
		this.ville = ville;
		this.codebanque = codebanque;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(int id, String nom, String prenom, int telephone) {
		super(id, nom, prenom, telephone);
		// TODO Auto-generated constructor stub
	}

	public Client(int codebanque) {
		super();
		this.codebanque = codebanque;
	}

	public int getCodebanque() {
		return codebanque;
	}

	public void setCodebanque(int codebanque) {
		this.codebanque = codebanque;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodepostale() {
		return codepostale;
	}

	public void setCodepostale(int codepostale) {
		this.codepostale = codepostale;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
