
public class Ordinatore 
{
	public static int scambia(int[]array,int pos1,int pos2)
	{
		int s;
		if(pos1<0 || pos2<0 || pos1>=array.length || pos2>=array.length)
			return -1;
		else
		{
			s=array[pos1];
			array[pos1]=array[pos2];
			array[pos2]=s;
			return 0;
		}
	}
	public static int scambia(String[]array,int pos1,int pos2)
	{
		String s;
		if(pos1<0 || pos2<0 || pos1>=array.length || pos2>=array.length)
			return -1;
		else
		{
			s=array[pos1];
			array[pos1]=array[pos2];
			array[pos2]=s;
			return 0;
		}
	}
	public static int scambia(Cliente[]array,int pos1,int pos2)
	{
		Cliente s;
		if(pos1<0 || pos2<0 || pos1>=array.length || pos2>=array.length)
			return -1;
		else
		{
			s=array[pos1];
			array[pos1]=array[pos2];
			array[pos2]=s;
			return 0;
		}
	}
	
	private static int[] copiaArray(int[]array)
	{
		int[]arrayCopia=new int[array.length];
		for (int i = 0; i < arrayCopia.length; i++) 
			arrayCopia[i]=array[i];
		return arrayCopia;
	}
	private static String[] copiaArray(String[]array)
	{
		String[]arrayCopia=new String[array.length];
		for (int i = 0; i < arrayCopia.length; i++) 
			arrayCopia[i]= array[i];
		return arrayCopia;
	}
	private static Cliente[] copiaArray(Cliente[]array)
	{
		Cliente[]arrayCopia=new Cliente[array.length];
		for (int i = 0; i < arrayCopia.length; i++) 
			arrayCopia[i] = array[i];
		return arrayCopia;
	}
	public static int[] selectionSortDecrescente(int[] array)
	{
		int[] arrayCopia=copiaArray(array);
		for (int i = 0; i < arrayCopia.length-1; i++) 
		{
			for (int j = i+1; j < arrayCopia.length; j++) 
			{
				if(arrayCopia[i]<arrayCopia[j])
					scambia(arrayCopia,i,j);
			}
		}
		return arrayCopia;
	}
	public static int[] selectionSortCrescente(int[] array)
	{
		int[] arrayCopia=copiaArray(array);
		for (int i = 0; i < arrayCopia.length-1; i++) 
		{
			for (int j = i+1; j < arrayCopia.length; j++) 
			{
				if(arrayCopia[i]>arrayCopia[j])
					scambia(arrayCopia,i,j);
			}
		}
		return arrayCopia;
	}
	
	public static String[] selectionSortDecrescente(String[] array)
	{
		String[] arrayCopia=copiaArray(array);
		for (int i = 0; i < arrayCopia.length-1; i++) 
		{
			for (int j = i+1; j < arrayCopia.length; j++) 
			{
				if(arrayCopia[i].compareToIgnoreCase(arrayCopia[j])<0)
					scambia(arrayCopia,i,j);
			}
		}
		return arrayCopia;
	}
	public static String[] selectionSortCrescente(String[] array)
	{
		String[] arrayCopia=copiaArray(array);
		for (int i = 0; i < arrayCopia.length-1; i++) 
		{
			for (int j = i+1; j < arrayCopia.length; j++) 
			{
				if(arrayCopia[i].compareToIgnoreCase(arrayCopia[j])>0)
					scambia(arrayCopia,i,j);
			}
		}
		return arrayCopia;
	}
	
	public static int[ ]bubbleSortCrescente(int[]array)
	{
		int[] arrayCopia=copiaArray(array);
		int j;
		boolean scambioAvvenuto=false;
		do 
		{
			scambioAvvenuto=false;
			for (int i = 0; i < arrayCopia.length-1; i++) 
			{
				j=i+1;
				if(arrayCopia[i]>arrayCopia[j])
				{
					scambia(arrayCopia, i,j);
					scambioAvvenuto=true;
				}
			}
		} while (scambioAvvenuto==true);
		return arrayCopia;
	}
	
	public static int[] bubbleSortDecrescente(int[]array)
	{
		int[] arrayCopia=copiaArray(array);
		int j;
		boolean scambioAvvenuto=false;
		do 
		{
			scambioAvvenuto=false;
			for (int i = 0; i < arrayCopia.length-1; i++) 
			{
				j=i+1;
				if(arrayCopia[i]<arrayCopia[j])
				{
					scambia(arrayCopia, i,j);
					scambioAvvenuto=true;
				}
			}
		} while (scambioAvvenuto==true);
		return arrayCopia;
	}
	public static String[] bubbleSortCrescente(String[]array)
	{
		String[] arrayCopia=copiaArray(array);
		int j;
		boolean scambioAvvenuto=false;
		do 
		{
			scambioAvvenuto=false;
			for (int i = 0; i < arrayCopia.length-1; i++) 
			{
				j=i+1;
				if(arrayCopia[i].compareToIgnoreCase(arrayCopia[j])>0)
				{
					scambia(arrayCopia, i,j);
					scambioAvvenuto=true;
				}
			}
		} while (scambioAvvenuto==true);
		return arrayCopia;
	}
	public static String[] bubbleSortDecrescente(String[]array)
	{
		String[] arrayCopia=copiaArray(array);
		int j;
		boolean scambioAvvenuto=false;
		do 
		{
			scambioAvvenuto=false;
			for (int i = 0; i < arrayCopia.length-1; i++) 
			{
				j=i+1;
				if(arrayCopia[i].compareToIgnoreCase(arrayCopia[j])<0)
				{
					scambia(arrayCopia, i,j);
					scambioAvvenuto=true;
				}
			}
		} while (scambioAvvenuto==true);
		return arrayCopia;
	}
	
	public static Cliente[] selectionSortCrescente(Cliente[] array)
	{
		Cliente[] arrayCopia=copiaArray(array);
		for (int i = 0; i < arrayCopia.length-1; i++) 
		{
			for (int j = i+1; j < arrayCopia.length; j++) 
			{
				if (arrayCopia[i].getNomeAzienda().compareTo(arrayCopia[j].getNomeAzienda())>0)
					scambia(arrayCopia, i, j);
			}
		}
		return arrayCopia;
	}
	
	
	

}
