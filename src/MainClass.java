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
		
	}

}
