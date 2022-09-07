public class Velguarder implements PoderMegaman{
	private String nombre = "Velguarder";
	private String frase = "Absorbe el miedo que tenga su oponente y ataca con sus garras de hierro a este. Quita al enemigo 32 HP.";
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
				"Megaman" + " " +
				frase + "\n" ;				
	}
}