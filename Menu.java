import java.io.*;

public class Menu {
	private void mostraMenu(){
		System.out.println("1) Aggiungi voce");
		System.out.println("2) Elimina Voce");
		System.out.println("3) Visualizza rubrica");
		System.out.println("4) Esci");
	}
	
	public int scelta(){
		mostraMenu();
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		int scelta = 0;	
		try{
			String s = tastiera.readLine();
			scelta = Integer.valueOf(s).intValue();
		}
		catch(Exception e){
			System.out.println("Scelta sbagliata.");
		}
		return scelta;
	}
	
	public int leggiIndice(){
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		int indice = 0;
		System.out.println("Voce da eliminare");
		try{
			String s = tastiera.readLine();
			indice = Integer.valueOf(s).intValue();
		}
		catch(Exception e){
			System.out.println("Indice inesistente.");
		}
		return indice;
	}

}
