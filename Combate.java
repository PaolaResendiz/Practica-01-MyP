import java.util.Scanner;

public class Combate{

	public String hayGanador(Korby korby, Megaman megaman, Dittu dittu){

			if(korby.getHP() <= 0){
				if(megaman.getHP() > dittu.getHP() )
					return"Gana Megaman";
				else if(dittu.getHP() > megaman.getHP() )
					return"Gana Dittu";
				else
					return"Megaman y Dittu empatan";
			}
			else if(megaman.getHP() <= 0){
				if(korby.getHP() > dittu.getHP() )
					return"Gana Korby";
				else if(dittu.getHP() > korby.getHP() )
					return"Gana Dittu";
				else
					return"Korby y Dittu empatan";
			}
			else if(dittu.getHP() <= 0){
				if(korby.getHP() > megaman.getHP() )
					return"Gana Korby";
				else if(megaman.getHP() > korby.getHP() )
					return"Gana Megaman";
				else
					return"Korbey Megaman empatan";
			}
			else
				return"";
	}

	public void verificarGanador(Korby korby, Megaman megaman, Dittu dittu, Stream stream){
		String ganador = hayGanador(korby, megaman, dittu);
		if(ganador != ""){
			System.out.println(ganador);
			stream.setnotificacion(ganador);
			stream.notificar();
			System.exit(0);
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
		Combate combate = new Combate();
		EscribirTexto utr = new EscribirTexto();
		Korby Korby = new Korby();
		Megaman Megaman = new Megaman();
		Dittu Dittu = new Dittu();
		for (int index = 1; index < 5; index++) {
			utr.EscribirString("jugador"+index+".txt", "Bienvendio jugador "+ index); 
		}

		Stream stream = new Stream();
		Espectador espectador = new Espectador("Usuario", stream,1);
		Espectador espectador2 = new Espectador("Usuario2", stream, 2);
		Espectador espectador3 = new Espectador("Usuario3", stream,3);
		Espectador espectador4 = new Espectador("Usuario4", stream, 4);
		System.out.println ("Bienvenido al combate, los  competidores de este torneo son: \n" + 
        "1. Korby"+
        "\n2. Megaman"+
        "\n3. Dittu");
		System.out.println ("Empieza el combate!!");
		String frase1 = Korby.ataqueMegaman(Megaman);
		System.out.println (frase1);
		stream.setnotificacion(frase1);
		stream.notificar();
		Dittu.Defensa();
		String frase2 =  Korby.ataqueDittu(Dittu);
		System.out.println (frase2);
		stream.setnotificacion(frase2);
		stream.notificar();
		Korby.habilidad();
		String frase3 = Korby.ataqueMegaman(Megaman);
		combate.verificarGanador(Korby, Megaman, Dittu, stream);
		System.out.println (frase3);
		stream.setnotificacion(frase3);
		stream.notificar();
		Megaman.habilidad();
		String frase4 = Dittu.ataqueMegaman(Megaman);
		combate.verificarGanador(Korby, Megaman, Dittu, stream);
		System.out.println (frase4);
		stream.setnotificacion(frase4);
		stream.notificar();
		System.out.println(Korby.getHP() + " " + Megaman.getHP() + " " + Dittu.getHP()); 
		String frase5= Megaman.ataqueDittu(Dittu);
		combate.verificarGanador(Korby, Megaman, Dittu, stream);
		System.out.println (frase5);
		stream.setnotificacion(frase5);
		stream.notificar();
		Dittu.habilidad();
		String frase6 = Dittu.ataqueKorby(Korby);
		combate.verificarGanador(Korby, Megaman, Dittu, stream);
		System.out.println (frase6);
		stream.setnotificacion(frase6);
		stream.notificar();
		String frase7 = Dittu.ataqueMegaman(Megaman);
		combate.verificarGanador(Korby, Megaman, Dittu, stream);
		System.out.println (frase7);
		stream.setnotificacion(frase7);
		stream.notificar();
		String frase8= Megaman.ataqueDittu(Dittu);
		combate.verificarGanador(Korby, Megaman, Dittu, stream);
		System.out.println (frase8);
		stream.setnotificacion(frase8);
		stream.notificar();
		String frase9= Megaman.ataqueKorby(Korby);
		combate.verificarGanador(Korby, Megaman, Dittu, stream);
		System.out.println (frase9);
		stream.setnotificacion(frase9);
		stream.notificar();
		String frase10 = Korby.ataqueMegaman(Megaman);
		combate.verificarGanador(Korby, Megaman, Dittu, stream);
		System.out.println (frase10);
		stream.setnotificacion(frase10);
		stream.notificar();
      



		// System.out.println("Korby agarra un objeto de habilidad");
		// Korby.habilidad();

		// // Korby.transformacionKorby(new Accho());
		// System.out.println (Korby.ataqueMegaman(Megaman));
		

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