import java.util.Vector;

public class Rubrica {
	private Vector rubrica;
		
	public Rubrica(){
		rubrica=new Vector(1,1);
	}
	
	public void aggiungiVoce(Voce v){
		rubrica.addElement(v);
	}
	
	public void eliminaVoce(int posizione){
		try{
			rubrica.removeElementAt(posizione);
			System.out.println("Eliminazione avvenuta con successo");
		}
		catch(Exception e){
			System.out.println("Errore nell'eliminazione");
		}
	}
	
	public void visualizzaRubrica(){
		Voce v;
		for(int i=0;i<rubrica.size();i++){
			v = (Voce) rubrica.elementAt(i);
			System.out.println("Posizione:  "+i+"  "+v.toString());
		}
	}
}
