public class Ninjako implements PoderKorby{
	private String nombre = "Ninjako";
	private String frase = "Golpea más fuerte y rápido a su enemigo. Quita al contrincante 41 HP ";
	
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

	/* public static void main(String[] args){
		Cocodrilo loki = new Cocodrilo();
		System.out.println(loki.mostrarInformacion());
	} */
}