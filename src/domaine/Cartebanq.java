package domaine;

public class Cartebanq {
	private int codecarte;
	private boolean statut;
	

	public Cartebanq(int codecarte, boolean statut) {
		super();
		this.codecarte = codecarte;
		this.statut = statut;
		
	}

	public int getCodecarte() {
		return codecarte;
	}

	public void setCodecarte(int codecarte) {
		this.codecarte = codecarte;
	}

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}




}
