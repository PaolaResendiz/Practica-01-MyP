import java.util.Random;
public class Korby {
    public PoderKorby Korby;
    private int HP;
    public void transformacionKorby(PoderKorby nuevoPoder){
		Korby = nuevoPoder;
		System.out.println ("Korby replica la habilidad de "  /* nuevoPoder.getNombre() */);
	}

    public String mostrarAtaqueKorby(){
        return Korby.ataque();
    }

    public void habilidad(){
        int randomNum = 1 + (int)(Math.random() * 3);
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
}

