public class Accho implements PoderKorby{
	private String nombre = "accho";
	private String frase = "lanza una llama de fuego y quita al contrincante 23 HP";
	private String getNombre(){
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
				frase + "\n" ;				
	}

	/* public static void main(String[] args){
		Cocodrilo loki = new Cocodrilo();
		System.out.println(loki.mostrarInformacion());
	} */
}