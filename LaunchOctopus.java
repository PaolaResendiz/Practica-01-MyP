public class LaunchOctopus implements PoderMegaman{
	private String nombre = "Launch Octopus";
	private String frase = "Los tentáculos de Octopus absorben la energía del usuario. Infringe 30 HP al contrincante.";
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