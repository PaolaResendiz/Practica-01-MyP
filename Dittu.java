import java.util.Random;
public class Dittu {
    private String [] ps = new String[0];
    private UtilidadesS uts = new UtilidadesS();
    private PoderDittu Poder;
    private boolean defendido;
    public String fraseAtaque  = " Dittu lanza un ataque gelatinoso y quita a su contrincante ";
    private int HP = 150;
    public void transformacionDittu(PoderDittu nuevoPoder){
		Poder = nuevoPoder;
        String frase = "Dittu replica la habilidad de "+  Poder.mostrarNombre();
		System.out.println (frase);
	}


    public String ataqueMegaman(Megaman enemigo){
        if(Poder==null){
            enemigo.setHP(enemigo.getHP() - 40);
            return 
                    fraseAtaque +  " Megaman " + "40 HP";
        }else{
            return Poder.ataqueMegaman(enemigo);
        }
       
    }

       
    public String ataqueKorby(Korby enemigo){
        if(Poder==null){
        enemigo.setHP(enemigo.getHP() - 40);
        return 
                fraseAtaque +  " Korby " + "40 HP";
        }else{
            return Poder.ataqueKorby(enemigo);
        }
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

    public String Defensa(){
        defendido = true;
        if(Poder==null){
            return "Dittu se defiende";
        }
        return Poder.defensa();
        
    }

    public PoderDittu getPoder(){
        return Poder;
    }

    public void setPoder(PoderDittu nuevoPoder){
        Poder = nuevoPoder;
    }

    public int getHP(){
        return HP;
    }

    public void setHP(int nuevoHP){
        HP = nuevoHP;
    }
    
    public boolean getDefendido(){
        return defendido;
    }

    public void setDefendido(boolean nuevoDefendido){
        defendido = nuevoDefendido;
    }
}

