public class Main {
	public static void main(String[] args) {
			Rubrica miaRubrica = new Rubrica();
			Menu mioMenu = new Menu();
			int scelta = mioMenu.scelta();
			while(scelta!=4){
				switch(scelta){
				case 0: 
					System.out.println("Inserire un numero");
					break;
				case 1:
					Voce v = new Voce("federico", "5346457");
					miaRubrica.aggiungiVoce(v);
					break;
				case 2:
					int posizione = mioMenu.leggiIndice();
					miaRubrica.eliminaVoce(posizione);
					break;
				case 3:
					miaRubrica.visualizzaRubrica();
					break;
					
				default:
					break;

				}
				
				scelta = mioMenu.scelta();

			}
			System.out.println("Programma terminato");
			
	}
	
}
