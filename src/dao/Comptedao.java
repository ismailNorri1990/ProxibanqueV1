package dao;

import java.util.ArrayList;

import domaine.Client;
import domaine.CompteBancaire;

public class Comptedao {
	
	
	public void verment(Client clnt1,Client clnt2,CompteBancaire compte,int montant,domaine.ConseillerClient conseiller)
	{
		ArrayList<Client> listClients = new ArrayList<Client>();
		ArrayList<Client> listReceveur = new ArrayList<Client>();
		for(Client client: listClients)
		{
			if(client.getId()==clnt1.getId())
			{
			int code=client.getCodebanque();
			int solde=compte.getSolde();
			
			}
			else
				System.out.println("client n'existe pas");
		}
		
		
	}

}
