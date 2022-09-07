public class AlbertoWilly implements PoderMegaman{
	private String nombre = "Alberto Willy";
	private String frase = "Recupera energía oscura para potenciar a uno de sus robots. Quita al enemigo 40 HP";
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