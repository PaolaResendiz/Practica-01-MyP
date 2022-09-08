
public class Korby {
    private String [] ps = new String[0];
    private UtilidadesS uts = new UtilidadesS();
    private PoderKorby Poder;
    private boolean defendido;
    public String fraseAtaque  = " Korby lanza un ataque eléctrico a ";
    private int HP = 150;
    public void transformacionKorby(PoderKorby nuevoPoder){
		Poder = nuevoPoder;
        String frase = "Korby replica la habilidad de "+  Poder.getNombre();
		System.out.println (frase);
    //     uts.leerObjetosArchivo("jugador1.txt");
    //   ps = uts.agregarAArregloString(frase);
    //   uts.EscribirObjetosArchivo("jugador1.txt",ps);
	}


    public String ataqueMegaman(Megaman enemigo){
        if(Poder==null){
            enemigo.setHP(enemigo.getHP() - 40);
            return 
                    fraseAtaque +  " Megaman " + " ";
        }else{
            return Poder.ataqueMegaman(enemigo);
        }
       
    }

       
    public String ataqueDittu(Dittu enemigo){
        if(Poder==null){
        enemigo.setHP(enemigo.getHP() - 40);
        return 
                fraseAtaque +  " Dittu " + " ";
        }else{
            return Poder.ataqueDittu(enemigo);
        }
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

    public String Defensa(){
        defendido = true;
        return Poder.defensa();
        
    }

    public PoderKorby getPoder(){
        return Poder;
    }

    public void setPoder(PoderKorby nuevoPoder){
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

