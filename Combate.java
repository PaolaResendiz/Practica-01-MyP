import java.util.Scanner;

public class Combate{

	/* Objeto de contexto. */
	private PoderKorby Korby;
    private PoderMegaman Megaman;
	private PoderDittu Dittu;
	
	private void transformacionKorby(PoderKorby nuevoPoder){
		Korby = nuevoPoder;
		System.out.println ("Korby replica la habilidad de "  /* nuevoPoder.getNombre() */);
	}

	private void transformacionMegaman(PoderMegaman nuevoPoder){
		Megaman = nuevoPoder;
		System.out.println ("Korby replica la habilidad de "  /* nuevoPoder.getNombre() */);
	}

	private void transformacionKorby(PoderDittu nuevoPoder){
		Dittu = nuevoPoder;
		System.out.println ("Korby replica la habilidad de "  /* nuevoPoder.getNombre() */);
	}


	/* public String mostrarAnimal(){
		return ditto.mostrarInformacion();
	}
 */
    public String mostrarAtaqueKorby(){
        return Korby.ataque();
    }
	public String mostrarAtaqueMegaman(){
        return Megaman.ataque();
    }
	public String mostrarAtaqueDittu(){
        return Dittu.ataque();
    }

	public String mostrarDefensaKorby(){
        return Korby.defensa();
    }
	public String mostrarDefensaMegaman(){
        return Megaman.defensa();
    }
	public String mostrarDefensaDittu(){
        return Dittu.defensa();
    }
	
	public static void main(String[] args){
		Combate zoo = new Combate();
		Scanner sc = new Scanner(System.in);
		int opcion;
		System.out.println ("Empieza el combate!!");
		System.out.println ("KIrby golpea Megaman con su ataque electrico");
		zoo.transformacionKorby(new Accho());
		System.out.println (zoo.mostrarAtaqueKorby());


		/* System.out.println("***BIENVENIDO AL ZOOLOGICO CHEEMS.***");

		do{
			System.out.println("Ingrese una de las siguientes " + 
				"opciones para mostrar al animal:\n" + 
				"1.- Oso.\n" +
				"2.- Flamenco.\n" + 
				"3.- Cocodrilo.\n" + 
				"4.- Rana.\n" +
				"5.- Elefante.\n" +
				"0.- Salir\n");
				
				

				while (true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
						System.out.println("Ingresa un numero valido.\n" + 
							"1.- Oso.\n" +
							"2.- Flamenco.\n" + 
							"3.- Cocodrilo.\n" + 
							"4.- Rana.\n" +
							"5.- Elefante.\n" +
							"0.- Salir\n");
					}
				}

				switch(opcion){
					case 1:
						zoo.transformarcion(new Oso());
						System.out.println(zoo.mostrarAnimal());
						break;

					case 2:
						zoo.transformarcion(new Flamenco());
						System.out.println(zoo.mostrarAnimal());
						break;

					case 3:
						zoo.transformarcion(new Cocodrilo());
						System.out.println(zoo.mostrarAnimal());
						break;

					case 4:
						zoo.transformarcion(new Rana());
						System.out.println(zoo.mostrarAnimal());
						break;

					case 5:
						zoo.transformarcion(new Elefante());
						System.out.println(zoo.mostrarAnimal());
						break;

					case 0:
						break;

					default:
						System.out.println("Ingresa un numero valido.\n" + 
							"1.- Oso.\n" +
							"2.- Flamenco.\n" + 
							"3.- Cocodrilo.\n" + 
							"4.- Rana.\n" +
							"5.- Elefante.\n" +
							"0.- Salir\n");
						break;

				}

		}while(opcion != 0); */
	}
}