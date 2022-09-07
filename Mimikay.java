public class Mimikay implements PoderDittu{
	private String nombre = "Mimikay";
	private String frase = "De las sombras puede crear unas manos las cuales te arañan y quita al contrincante 20 HP";
	
	public String getNombre(){
		return nombre;
	}

	@Override
	public String defensa(){
		return "";
	}

	@Override
	public String ataque(){
		return 
				"Dittu" + " " +
				frase + "\n" ;				
	}
}