public class Metapod implements PoderDittu{
	private String nombre = "Metapod";
	private String frase = "Utiliza un ataque basico y quita al contrincante 15 HP";
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