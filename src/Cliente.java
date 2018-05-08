import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cliente
{
	private String codiceIdentificativo;
	private String nomeAzienda;
	private String cittaSede;
	private LocalDate data;
	
	public Cliente (String codiceIdentificativo, String nomeAzienda, String cittaSede, LocalDate data1)
	{
		setCodiceIdentificativo(codiceIdentificativo);
		setNomeAzienda(nomeAzienda);
		setCittaSede(cittaSede);
		setData(data1);
	}
	public Cliente (Cliente c)
	{
		setCodiceIdentificativo(c.getCodiceIdentificativo());
		setNomeAzienda(c.getNomeAzienda());
		setCittaSede(c.getCittaSede());
		setData(c.getData());
	}
	public Cliente ()
	{
		setCodiceIdentificativo(null);
		setNomeAzienda(null);
		setCittaSede(null);
		setData(null);
	}
	public String getCodiceIdentificativo() 
	{
		return codiceIdentificativo;
	}
	public void setCodiceIdentificativo(String codiceIdentificativo2) 
	{
		this.codiceIdentificativo = codiceIdentificativo2;
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
	public LocalDate getData() 
	{

		return data;
	}
	public void setData(LocalDate data1) 
	{
		this.data = data1;
	}
	public String toString ()
	{
		String risultato = "";
		risultato+= getCodiceIdentificativo() + "; "+ getNomeAzienda() + "; " + getCittaSede() + "; " + getData();
		return risultato;
	}
	
}
