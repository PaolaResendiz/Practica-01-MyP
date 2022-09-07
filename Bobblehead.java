public class Bobblehead implements PoderKorby{
	private String nombre = "Bobblehead";
	private String frase = "Lanza burbujas con ácido. Quita al contrincante 54 HP";
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
				"Korby" + " " +
				frase;
				
	}

}