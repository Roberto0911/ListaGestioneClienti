
public class NuovaException extends Exception 
{
private String messaggio;
	
	public NuovaException (String messaggio)
	{
		this.messaggio=messaggio;
	}
	public String toString()
	{
		return messaggio;
	}
}
