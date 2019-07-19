package dao;

import java.util.ArrayList;

import domaine.Cartebanq;
import domaine.Client;

public class ClientDao {

	Cartebanq cart1 = new Cartebanq((int) 12, true);
	// CompteBancaire compte1 = new CompteBancaire(1222, 22222, LocalDate.now(),
	// (int) cart1.getCodecarte());
	// Client client1 = new Client(1222, "KACHAF", "mustafa", 062635252, "CASA",
	// 12333, "CASA", compte1.getCodebanque());
	ArrayList<Client> listclient = new ArrayList<Client>();

	public void ajouterClient(Client clnt) {
		listclient.add(clnt);

	}

	public void modifierClient(int i, Client clnt) {
		listclient.set(i, clnt);

	}

	public void supprimerClient(int i) {
		listclient.remove(i);

	}

}