import java.util.Scanner;

public class Combate{

	
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
		Combate zoo = new Combate();
		Scanner sc = new Scanner(System.in);
		int opcion;
		System.out.println ("Bienvenido al combate, los  competidores de este sion: /n" + 
        "1. Korby"+
        "2. Megaman"+
        "3. Dittu");
		System.out.println ("Empieza el combate!!");
		String frase1 = "Kirby golpea Megaman con su ataque electrico";
		System.out.println (frase1);
		// uts.LeerString("jugador1.txt");
      String ps = uts.LeerString("jugador1.txt") + frase1;
	  System.out.println(ps);
      utr.EscribirString("jugador1.txt",ps);


		System.out.println("Korby agarra un objeto de habilidad");
		Korby.habilidad();
		// Korby.transformacionKorby(new Accho());
		System.out.println (Korby.mostrarAtaqueKorby());
		

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