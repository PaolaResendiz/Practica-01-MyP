public class Bobblehead implements PoderKorby{
	private String nombre = "Bobblehead";
	private String frase = "Lanza burbujas con acido. Quita al contrincante 54 HP";
	public String getNombre(){
		return nombre;
	}
	@Override
	public String defensa(){
		return "";
	}

	@Override
	public String ataqueMegaman(Megaman enemigo){
        enemigo.setHP(enemigo.getHP() - 40);
        return 
                frase +  " Megaman " + " ";
    }
       
    public String ataqueDittu(Dittu enemigo){
        enemigo.setHP(enemigo.getHP() - 40);
        return 
                frase +  " Dittu " + " ";
    }

}