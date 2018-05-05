import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Lista implements Serializable
{
	private Nodo head;
	private int elementi;
	
	public Lista ()
	{
		head = null;
		elementi =0;
	}
	public int getElementi()
	{
		return elementi;
	}
	private Nodo creaNodo (Cliente azienda, Nodo link)
	{
		Nodo nodo = new Nodo(azienda);
		nodo.setLink(link);
		return nodo;
	}
	private Nodo getLinkPosizione (int posizione) throws ListaException 
	{
		Nodo p;
		int n;
		p = head;
		n=1;
		if (posizione<1 || posizione>getElementi())
			throw new ListaException ("Poszione non valida");
		if (elementi == 0)
			throw new ListaException ("Lista vuota");
		while (p.getLink()!=null && n<posizione)
		{
			p=p.getLink();	
			n++;
		}
		return p;
	}
	private void inseriscInTesta (Cliente azienda)
	{
		Nodo p = creaNodo(azienda, head);
		head = p;
		elementi++;
	}
	public void inserisciInCoda (Cliente azienda) throws ListaException 
	{
		if (elementi == 0)
		{
			inseriscInTesta(azienda);
			return;
		}
		Nodo pn = creaNodo(azienda, null);
		Nodo p = getLinkPosizione(elementi);
		p.setLink(pn);
		elementi++;
	}
	/*public void eliminaCliente (String codice) throws ListaException
	{
		if (elementi == 0)
			throw new ListaException("Lista vuolta");
		if (codice == null)
			throw new ListaException("Codice non valido");
		Nodo p = head;
		while (p!=null) 
		{
			if (p.getInfo().getCodiceIdentificativo().compareTo(codice)==0)
			{
				Nodo precedente = getLinkPosizione();
				precedente.setLink(p.getLink());
				elementi--; 
			}
				
				
		}
	}*/
	public String visita (int posizione) throws ListaException
	{
		if (elementi == 0)
			throw new ListaException("Lista vuolta");
		if (posizione <= 0 || posizione>elementi)
			throw new ListaException("Posizione non valida");
		Nodo c = getLinkPosizione(posizione);
		return c.getInfo().toString();
	}
	public Cliente getCliente (int posizione) throws ListaException
	{
		if (elementi == 0)
			throw new ListaException("Lista vuolta");
		if (posizione <= 0 || posizione>elementi)
			throw new ListaException("Posizione non valida");
		Nodo p = getLinkPosizione(posizione);
		return p.getInfo();
	}
	public String toString()
	{
		String risultato = "Head";
		if (elementi == 0)
			return risultato+= "-->";
		Nodo p = head;
		while (p != null)
		{
			risultato+="-->"+p.getInfo().toString();
			p = p.getLink();
		}
		return risultato;
	}
	public void esportaCSV (String nomeFile) throws IOException, ListaException, FileException
	{
		TextFile file = new TextFile(nomeFile, 'W');
		String personaCSV;
		Cliente azienda;
		for (int i = 1; i <= getElementi(); i++)
		{
			azienda = getCliente(i);
			personaCSV =azienda.getCodiceIdentificativo() + "; "+ azienda.getNomeAzienda() + "; " + azienda.getCittaSede() + "; " + azienda.getData() + ".";
			file.toFile(personaCSV);
		}
		file.closeFile();
	}
	public void salvaLista(String nomeFile) throws IOException
	{
		FileOutputStream file = new FileOutputStream(nomeFile);
		ObjectOutputStream writer = new ObjectOutputStream(file);
		writer.writeObject(this);
		writer.flush();
		file.close();
	}
	public String[] getOrdineAlfabetico () 
	{
		String[] elencoClienti = new String [elementi];
		int j=0;
		Nodo p = head;
		for (int i = 0; i < getElementi()-1; i++) 
		{
			if (p!=null)
			{
				
					elencoClienti[j] = p.getInfo().getNomeAzienda();
					j++;
					p = p.getLink();
			}
		}
		elencoClienti = Ordinatore.selectionSortDecrescente(elencoClienti);
		return elencoClienti;
	}
	}
	
	
