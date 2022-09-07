import java.util.Random;
public class Korby {
    private String [] ps = new String[0];
    private UtilidadesS uts = new UtilidadesS();
    private PoderKorby Korby;
    private int HP;
    public void transformacionKorby(PoderKorby nuevoPoder){
		Korby = nuevoPoder;
        String frase = "Korby replica la habilidad de "+  Korby.getNombre();
		System.out.println (frase);
    //     uts.leerObjetosArchivo("jugador1.txt");
    //   ps = uts.agregarAArregloString(frase);
    //   uts.EscribirObjetosArchivo("jugador1.txt",ps);
	}

    public String mostrarAtaqueKorby(){
        return Korby.ataque();
    }

    public void habilidad(){
        int randomNum = 1 + (int)(Math.random() * 3);
        System.out.println(randomNum);
        switch(randomNum){
            case 1:
            transformacionKorby(new Accho());
            break;
            case 2: 
            transformacionKorby(new Bobblehead());
            break;
            case 3:
            transformacionKorby(new Ninjako());
            break;
        }
    }

    public String mostrarDefensaKorby(){
        return Korby.defensa();
    }

    public PoderKorby getPoder(){
        return Korby;
    }

    public void setPoder(PoderKorby nuevoPoder){
        Korby = nuevoPoder;
    }

    public int getHP(){
        return HP;
    }

    public void setHP(int nuevoHP){
        HP = nuevoHP;
    }
    
}

