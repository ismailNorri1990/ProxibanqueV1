package domaine;

import java.time.LocalDate;

public class CompteBancaire {

	private int codebanque;
	private int solde;
	private LocalDate dateouverture;
	private int codecarte;

	public int getCodebanque() {
		return codebanque;
	}

	public void setCodebanque(int codebanque) {
		this.codebanque = codebanque;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	public LocalDate getDateouverture() {
		return dateouverture;
	}

	public void setDateouverture(LocalDate dateouverture) {
		this.dateouverture = dateouverture;
	}

	public int getCodecarte() {
		return codecarte;
	}

	public void setCodecarte(int codecarte) {
		this.codecarte = codecarte;
	}

	public CompteBancaire(int codebanque, int solde, LocalDate dateouverture, int codecarte) {
		super();
		this.codebanque = codebanque;
		this.solde = solde;
		this.dateouverture = dateouverture;
		this.codecarte = codecarte;
	}

}
