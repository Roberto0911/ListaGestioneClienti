import java.time.LocalDate;


public class MainClass 
{

	public static void main(String[] args) 
	{
		LocalDate data1 = LocalDate.of(2002, 7, 25);
		LocalDate data2 = LocalDate.of(2000, 6, 19);
		LocalDate data3 = LocalDate.of(1999, 10, 26);
		
		Cliente c1 =  new Cliente("aac58t", "Recom", "roma", data1);
		Cliente c2 =  new Cliente("trdhe565", "Alegay", "boario", data3);
		Cliente c3 =  new Cliente("vdfjk", "Lazzarini", "Piamborno", data2);
		
		Lista l1 = new Lista();
		try 
		{
			l1.inserisciInCoda(c1);
			l1.inserisciInCoda(c2);
			l1.inserisciInCoda(c3);
		}
		catch (ListaException e) 
		{
			e.toString();
		}
		System.out.println(l1.getOrdineAlfabetico());
	}
	
}


