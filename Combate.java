import java.util.Scanner;

public class Combate{

	public String hayGanador(Korby korby, Megaman megaman, Dittu dittu){

			if(korby.getHP() <= 0){
				System.out.println("Ha muerto Korby! Se decidira el ganador por el personaje con mas vida");
				if(megaman.getHP() > dittu.getHP() )
					return"Gana Megaman";
				else if(dittu.getHP() > megaman.getHP() )
					return"Gana Dittu";
				else
					return"Megaman y Dittu empatan";
			}
			else if(megaman.getHP() <= 0){
				System.out.println("Ha muerto Megaman! Se decidira el ganador por el personaje con mas vida");
				if(korby.getHP() > dittu.getHP() )
					return"Gana Korby";
				else if(dittu.getHP() > korby.getHP() )
					return"Gana Dittu";
				else
					return"Korby y Dittu empatan";
			}
			else if(dittu.getHP() <= 0){
				System.out.println("Ha muerto Dittu! Se decidira el ganador por el personaje con mas vida");
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
		int randomNum = 1 + (int)(Math.random() * 3);
		switch(randomNum){
			case 1:
			System.out.println ("Empieza el combate!!");
		String frase1 = Korby.ataqueMegaman(Megaman);
		System.out.println (frase1);
		stream.setnotificacion(frase1);
		stream.notificar();
		String frase2 = Korby.habilidad();
		System.out.println (frase2);
		stream.setnotificacion(frase2);
		stream.notificar();
		String frase3 = Dittu.Defensa();
		System.out.println (frase3);
		stream.setnotificacion(frase3);
		stream.notificar();
		String frase4 = Dittu.habilidad();
		System.out.println (frase4);
		stream.setnotificacion(frase4);
		stream.notificar();

		String frase5=  Korby.ataqueDittu(Dittu);
		System.out.println (frase5);
		stream.setnotificacion(frase5);
		stream.notificar();
		combate.verificarGanador(Korby, Megaman, Dittu, stream);

		String frase6 = Korby.habilidad();
		System.out.println (frase6);
		stream.setnotificacion(frase6);
		stream.notificar();

		String frase7 = Korby.ataqueMegaman(Megaman);
		System.out.println (frase7);
		stream.setnotificacion(frase7);
		stream.notificar();
		combate.verificarGanador(Korby, Megaman, Dittu, stream);
		
		Megaman.habilidad();

		String frase8 = Megaman.Defensa();
		System.out.println (frase8);
		stream.setnotificacion(frase8);
		stream.notificar();

		String frase9 = Dittu.ataqueMegaman(Megaman);
		System.out.println (frase9);
		stream.setnotificacion(frase9);
		stream.notificar();
		combate.verificarGanador(Korby, Megaman, Dittu, stream);
		System.out.println(Korby.getHP() + " " + Megaman.getHP() + " " + Dittu.getHP()); 

		String frase10= Megaman.ataqueDittu(Dittu);
		System.out.println (frase10);
		stream.setnotificacion(frase10);
		stream.notificar();
		combate.verificarGanador(Korby, Megaman, Dittu, stream);

		String frase11 = Dittu.ataqueKorby(Korby);
		System.out.println (frase11);
		stream.setnotificacion(frase11);
		stream.notificar();
		combate.verificarGanador(Korby, Megaman, Dittu, stream);

		String frase12 = Dittu.ataqueMegaman(Megaman);
		System.out.println (frase12);
		stream.setnotificacion(frase12);
		stream.notificar();
		String frase13= Megaman.ataqueDittu(Dittu);
		combate.verificarGanador(Korby, Megaman, Dittu, stream);
		System.out.println (frase13);
		stream.setnotificacion(frase13);
		stream.notificar();
		combate.verificarGanador(Korby, Megaman, Dittu, stream);

		String frase14= Megaman.ataqueKorby(Korby);
		System.out.println (frase14);
		stream.setnotificacion(frase14);
		stream.notificar();
		combate.verificarGanador(Korby, Megaman, Dittu, stream);
		String frase15= Korby.ataqueMegaman(Megaman);
		System.out.println (frase15);
		stream.setnotificacion(frase15);
		stream.notificar();
		combate.verificarGanador(Korby, Megaman, Dittu, stream);
      break;
			
			case 2:
			System.out.println ("Empieza el combate!!");
String frase21 = Megaman.ataqueKorby(Korby);
System.out.println (frase21);
stream.setnotificacion(frase21);
stream.notificar();
String frase22 = Megaman.habilidad();
System.out.println (frase22);
stream.setnotificacion(frase22);
stream.notificar();
String frase23 = Dittu.Defensa();
System.out.println (frase23);
stream.setnotificacion(frase23);
stream.notificar();
String frase24 = Dittu.habilidad();
System.out.println (frase24);
stream.setnotificacion(frase24);
stream.notificar();

String frase25=  Megaman.ataqueDittu(Dittu);
System.out.println (frase25);
stream.setnotificacion(frase25);
stream.notificar();
combate.verificarGanador(Korby, Megaman, Dittu, stream);

String frase26 = Megaman.habilidad();
System.out.println (frase26);
stream.setnotificacion(frase26);
stream.notificar();

String frase27 = Megaman.ataqueKorby(Korby);
System.out.println (frase27);
stream.setnotificacion(frase27);
stream.notificar();
combate.verificarGanador(Korby, Megaman, Dittu, stream);

Korby.habilidad();

String frase28 = Korby.Defensa();
System.out.println (frase28);
stream.setnotificacion(frase28);
stream.notificar();

String frase29 = Dittu.ataqueKorby(Korby);
System.out.println (frase29);
stream.setnotificacion(frase29);
stream.notificar();
combate.verificarGanador(Korby, Megaman, Dittu, stream);
System.out.println(Megaman.getHP() + " " + Korby.getHP() + " " + Dittu.getHP()); 

String frase210= Korby.ataqueDittu(Dittu);
System.out.println (frase210);
stream.setnotificacion(frase210);
stream.notificar();
combate.verificarGanador(Korby, Megaman, Dittu, stream);

String frase211 = Dittu.ataqueMegaman(Megaman);
System.out.println (frase211);
stream.setnotificacion(frase211);
stream.notificar();
combate.verificarGanador(Korby, Megaman, Dittu, stream);

String frase212 = Dittu.ataqueKorby(Korby);
System.out.println (frase212);
stream.setnotificacion(frase212);
stream.notificar();
String frase213= Korby.ataqueDittu(Dittu);
combate.verificarGanador(Korby, Megaman, Dittu, stream);
System.out.println (frase213);
stream.setnotificacion(frase213);
stream.notificar();
combate.verificarGanador(Korby, Megaman, Dittu, stream);

String frase214= Korby.ataqueMegaman(Megaman);
System.out.println (frase214);
stream.setnotificacion(frase214);
stream.notificar();
combate.verificarGanador(Korby, Megaman, Dittu, stream);
String frase215= Megaman.ataqueKorby(Korby);
System.out.println (frase215);
stream.setnotificacion(frase215);
stream.notificar();
combate.verificarGanador(Korby, Megaman, Dittu, stream);
break;
			
			case 3:
			System.out.println ("Empieza el combate!!");
String frase31 = Megaman.ataqueDittu(Dittu);
System.out.println (frase31);
stream.setnotificacion(frase31);
stream.notificar();
String frase32 = Megaman.habilidad();
System.out.println (frase32);
stream.setnotificacion(frase32);
stream.notificar();
String frase33 = Korby.Defensa();
System.out.println (frase33);
stream.setnotificacion(frase33);
stream.notificar();
String frase34 = Korby.habilidad();
System.out.println (frase34);
stream.setnotificacion(frase34);
stream.notificar();

String frase35=  Megaman.ataqueKorby(Korby);
System.out.println (frase35);
stream.setnotificacion(frase35);
stream.notificar();
combate.verificarGanador(Korby, Megaman, Dittu, stream);

String frase36 = Megaman.habilidad();
System.out.println (frase36);
stream.setnotificacion(frase36);
stream.notificar();

String frase37 = Megaman.ataqueDittu(Dittu);
System.out.println (frase37);
stream.setnotificacion(frase37);
stream.notificar();
combate.verificarGanador(Korby, Megaman, Dittu, stream);

Dittu.habilidad();

String frase38 = Dittu.Defensa();
System.out.println (frase38);
stream.setnotificacion(frase38);
stream.notificar();

String frase39 = Korby.ataqueDittu(Dittu);
System.out.println (frase39);
stream.setnotificacion(frase39);
stream.notificar();
combate.verificarGanador(Korby, Megaman, Dittu, stream);
System.out.println(Megaman.getHP() + " " + Dittu.getHP() + " " + Korby.getHP()); 

String frase310= Dittu.ataqueKorby(Korby);
System.out.println (frase310);
stream.setnotificacion(frase310);
stream.notificar();
combate.verificarGanador(Korby, Megaman, Dittu, stream);

String frase311 = Korby.ataqueMegaman(Megaman);
System.out.println (frase311);
stream.setnotificacion(frase311);
stream.notificar();
combate.verificarGanador(Korby, Megaman, Dittu, stream);

String frase312 = Korby.ataqueDittu(Dittu);
System.out.println (frase312);
stream.setnotificacion(frase312);
stream.notificar();
String frase313= Dittu.ataqueKorby(Korby);
combate.verificarGanador(Korby, Megaman, Dittu, stream);
System.out.println (frase313);
stream.setnotificacion(frase313);
stream.notificar();
combate.verificarGanador(Korby, Megaman, Dittu, stream);

String frase314= Dittu.ataqueMegaman(Megaman);
System.out.println (frase314);
stream.setnotificacion(frase314);
stream.notificar();
combate.verificarGanador(Korby, Megaman, Dittu, stream);
String frase315= Megaman.ataqueDittu(Dittu);
System.out.println (frase315);
stream.setnotificacion(frase315);
stream.notificar();
combate.verificarGanador(Korby, Megaman, Dittu, stream);
break;

		}
		

	}
}