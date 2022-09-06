public class Bobblehead implements Poder{
	private String nombre = "Bobblehead";
	private String frase = "Lanza burbujas con ácido. Quita al contrincante 68 HP. Bobble head se lastima asi mismo y pierde 13 HP";
	private String clase = "Sauropsida.";
	private String orden = "Crocodilia.";
	private String familia = "Alligatoridae.";
	private String genero = "Alligator.";
	private String sonido = "Rugido.";
	private String apariencia = "           .-._   _ _ _ _ _ _ _ _" + "\n" +
								".-''-.__.-'00  '-' ' ' ' ' ' ' ' '-." + "\n" +
								"'.___ '    .   .--_'-' '-' '-' _'-' '._" + "\n" +
 								" V: V 'vv-'   '_   '.       .'  _..' '.'." + "\n" +
   								"   '=.____.=_.--'   :_.__.__:_   '.   : :" + "\n" +
           						"           (((____.-'        '-.  /   : :" + "\n" +
 								"                             (((-'\\ .' /" + "\n" +
                           		"                           _____..'  .'" + "\n" +
                          		"                          '-._____.-'";

	private String getNombre(){
		return nombre;
	}
/* 
	private String getReino(){
		return reino;
	}
 */
	private String getClase(){
		return clase;
	}

	private String getOrden(){
		return orden;
	}

	private String getFamilia(){
		return familia;
	}

	private String getGenero(){
		return genero;
	}

	private String getSonido(){
		return sonido;
	}

	private String getApariencia(){
		return apariencia;
	}

	@Override
	public String defensa(){
		return "";
	}
	@Override
	public String ataque(){
		return 
				"Korby" + " " +
				frase + "\n" +
				"Clase: " + getClase() + "\n" +
				"Orden: " + getOrden() + "\n" +
				"Familia: " + getFamilia() + "\n" +
				"Genero: " + getGenero() + "\n" +
				"Sonido: " + getSonido() + "\n";
				
	}

	/* public static void main(String[] args){
		Cocodrilo loki = new Cocodrilo();
		System.out.println(loki.mostrarInformacion());
	} */
}