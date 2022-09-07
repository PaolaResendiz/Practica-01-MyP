import java.util.Random;
public class Dittu {
    public PoderDittu Dittu;
    private int HP;
    public void transformacionDittu(PoderDittu nuevoPoder){
		Dittu = nuevoPoder;
		System.out.println ("Dittu replica la habilidad de "+  Dittu.getNombre());
	}

    public String mostrarAtaqueDittu(){
        return Dittu.ataque();
    }

    public void habilidad(){
        int randomNum = 1 + (int)(Math.random() * 3);
        System.out.println(randomNum);
        switch(randomNum){
            case 1:
            transformacionDittu(new Metapod());
            break;
            case 2: 
            transformacionDittu(new Mimikay());
            break;
            case 3:
            transformacionDittu(new Suicune());
            break;
        }
    }

    public String mostrarDefensaDittu(){
        return Dittu.defensa();
    }

    public PoderDittu getPoder(){
        return Dittu;
    }

    public void setPoder(PoderDittu nuevoPoder){
        Dittu = nuevoPoder;
    }

    public int getHP(){
        return HP;
    }

    public void setHP(int nuevoHP){
        HP = nuevoHP;
    }
}

