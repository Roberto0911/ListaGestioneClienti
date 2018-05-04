import java.io.Serializable;

public class Nodo implements Serializable
{
	private Cliente info;
	private Nodo link;
	
	public Nodo (Cliente azienda)
	{
		setInfo(azienda);
		link = null;
	}
	public Cliente getInfo() 
	{
		return info;
	}
	public void setInfo(Cliente info) 
	{
		this.info = info;
	}
	public Nodo getLink() 
	{
		return link;
	}
	public void setLink(Nodo link) 
	{
		this.link = link;
	}
	
}

