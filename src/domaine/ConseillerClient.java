package domaine;

import java.util.Collection;

public class ConseillerClient extends Personne {
	public ConseillerClient(Collection<Client> clients) {
		super();
		this.clients = clients;
	}

	public Collection<Client> getClients() {
		return clients;
	}

	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	private Collection<Client> clients;

}
