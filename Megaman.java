public class Megaman {
    private PoderMegaman Poder;
    private boolean defendido;
    public String fraseAtaque  = " Korby lanza un ataque eléctrico a ";
    private int HP= 150;
    private void transformacionMegaman(PoderMegaman nuevoPoder){
		Poder = nuevoPoder;
		System.out.println ("Megaman replica la habilidad de "  + nuevoPoder.getNombre());
	}

    public String ataqueKorby(Korby enemigo){
        if(Poder==null){
            enemigo.setHP(enemigo.getHP() - 40);
            return 
                    fraseAtaque +  " Korby " + " ";
        }else{
            return Poder.ataqueKorby(enemigo);
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
        switch(randomNum){
            case 1:
            transformacionMegaman(new Velguarder());
            break;
            case 2: 
            transformacionMegaman(new AlbertoWilly());
            break;
            case 3:
            transformacionMegaman(new LaunchOctopus());
            break;
        }
    }

    public String Defensa(){
        defendido = true;
        return Poder.defensa();
        
    }

    public PoderMegaman getPoder(){
        return Poder;
    }

    public void setPoder(PoderMegaman nuevoPoder){
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
