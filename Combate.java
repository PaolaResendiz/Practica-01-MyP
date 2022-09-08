import java.util.Scanner;

public class Combate{

	public void hayGanador(Korby korby, Megaman megaman, Dittu dittu){
		for(int i = 0; i < 3; i++){
			if(korby.getHP() <= 0){
				System.out.println("Megaman ha ganado el combate");
				break;
			}
			else if(megaman.getHP() <= 0){
				System.out.println("Korby ha ganado el combate");
				break;
			}
			else if(dittu.getHP() <= 0){
				System.out.println("Korby ha ganado el combate");
				break;
			}
			else{
				System.out.println("El combate continua");
				break;
			}
		}
	}
// 	/* Objeto de contexto. */
	
//     private PoderMegaman Megaman;
// 	private PoderDittu Dittu;
	
	

// 	private void transformacionMegaman(PoderMegaman nuevoPoder){
// 		Megaman = nuevoPoder;
// 		System.out.println ("Korby replica la habilidad de "  /* nuevoPoder.getNombre() */);
// 	}

// 	private void transformacionKorby(PoderDittu nuevoPoder){
// 		Dittu = nuevoPoder;
// 		System.out.println ("Korby replica la habilidad de "  /* nuevoPoder.getNombre() */);
// 	}


// 	/* public String mostrarAnimal(){
// 		return ditto.mostrarInformacion();
// 	}
//  */
    
// 	public String mostrarAtaqueMegaman(){
//         return Megaman.ataque();
//     }
// 	public String mostrarAtaqueDittu(){
//         return Dittu.ataque();
//     }

	
// 	public String mostrarDefensaMegaman(){
//         return Megaman.defensa();
//     }
// 	public String mostrarDefensaDittu(){
//         return Dittu.defensa();
//     }

	public static void main(String[] args){
		LeerSt uts = new LeerSt();
		EscribirTexto utr = new EscribirTexto();
		Korby Korby = new Korby();
		Megaman Megaman = new Megaman();
		Dittu Dittu = new Dittu();

		Combate zoo = new Combate();
		Scanner sc = new Scanner(System.in);
		int opcion;
		Stream stream = new Stream();
		Espectador espectador = new Espectador("Usuario", stream);
		Espectador espectador2 = new Espectador("Usuario2", stream);
		Espectador espectador3 = new Espectador("Usuario3", stream);
		Espectador espectador4 = new Espectador("Usuario4", stream);
		System.out.println ("Bienvenido al combate, los  competidores de este sion: /n" + 
        "1. Korby"+
        "2. Megaman"+
        "3. Dittu");
		System.out.println ("Empieza el combate!!");
		String frase1 = Korby.ataqueMegaman(Megaman);
		System.out.println (frase1);
		stream.setnotificacion(frase1);
		stream.notificar();
		// Megaman.setHP(Megaman.getHP() - 54);
		System.out.println ("Megaman tiene " + Megaman.getHP() + " HP");
		String frase2 = "Megaman golpea a Korby con su espada de energía, quita al contrincante 32 HP";
		// uts.LeerString("jugador1.txt");
		System.out.println (frase2);
		stream.setnotificacion(frase2);
		stream.notificar();

      



		System.out.println("Korby agarra un objeto de habilidad");
		Korby.habilidad();

		// Korby.transformacionKorby(new Accho());
		System.out.println (Korby.ataqueMegaman(Megaman));
		

		/* System.out.println("***BIENVENIDO AL ZOOLOGICO CHEEMS.***");

		do{
			System.out.println ("Ingrese la opción del competidor al que desea apoyar " + "opciones para mostrar al competidor:\n" + 
        "1. Korby"+
        "2. Megaman"+
        "3. Dittu");
				
				

				while (true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
						System.out.println("Ingresa un numero valido.\n" + 
        "1. Korby"+
        "2. Megaman"+
        "3. Dittu");
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