package rubrica;


public class Voce{
	private String nome;
	private String telefono;
	
	public Voce(String nome, String telefono){
		this.nome = new String();
		this.nome = nome;
		this.telefono = new String();
		this.telefono = telefono;
	}

	public void stampaVoce(){
		this.toString();
	}

	@Override
	public String toString() {
		return "nome =" + nome + ", telefono=" + telefono;
	}
	
}
