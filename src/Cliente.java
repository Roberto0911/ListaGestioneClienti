import java.time.LocalDateTime;

public class Cliente
{
	private int codiceIdentificativo;
	private String nomeAzienda;
	private String cittaSede;
	private LocalDateTime data;
	
	public Cliente (int codiceIdentificativo, String nomeAzienda, String cittaSede, LocalDateTime data)
	{
		setCodiceIdentificativo(codiceIdentificativo);
		setNomeAzienda(nomeAzienda);
		setCittaSede(cittaSede);
		setData(data);
	}
	public Cliente (Cliente c)
	{
		setCodiceIdentificativo(c.getCodiceIdentificativo());
		setNomeAzienda(c.getNomeAzienda());
		setCittaSede(c.getCittaSede());
		setData(c.getData());
	}
	public int getCodiceIdentificativo() 
	{
		return codiceIdentificativo;
	}
	public void setCodiceIdentificativo(int codiceIdentificativo) 
	{
		this.codiceIdentificativo = codiceIdentificativo;
	}
	public String getNomeAzienda() 
	{
		return nomeAzienda;
	}
	public void setNomeAzienda(String nomeAzienda)
	{
		this.nomeAzienda = nomeAzienda;
	}
	public String getCittaSede() 
	{
		return cittaSede;
	}
	public void setCittaSede(String cittaSede)
	{
		this.cittaSede = cittaSede;
	}
	public LocalDateTime getData() 
	{

		return data;
	}
	public void setData(LocalDateTime data) 
	{
		this.data = data;
	}
	public String toString ()
	{
		String risultato = null;
		risultato+= getCodiceIdentificativo() + "; "+ getNomeAzienda() + "; " + getCittaSede() + "; " + getData() + ".";
		return risultato;
	}
	
}
