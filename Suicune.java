public class Suicune implements PoderDittu{
	private String nombre = "Suicune";
	private String frase = "Utiliza unos colmillos que al morder convierte en hielo al contrincante. Pierde 30 HP";
	
	public String getNombre(){
		return nombre;
	}

	@Override
	public String defensa(){
		return "";
	}
	//sadasdssad
	@Override
	public String ataque(){
		return 
				"Dittu" + " " +
				frase + "\n" ;				
	}
}