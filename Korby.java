
public class Korby {
    private String [] ps = new String[0];
    private UtilidadesS uts = new UtilidadesS();
    private PoderKorby Poder;
    private boolean defendido;
    public String fraseAtaque  = " Korby lanza un ataque eléctrico y quita a ";
    private int HP = 150;
    public String transformacionKorby(PoderKorby nuevoPoder){
		Poder = nuevoPoder;
        String frase = "Korby replica la habilidad de "+  mostrarNombre();
		return frase;
    //     uts.leerObjetosArchivo("jugador1.txt");
    //   ps = uts.agregarAArregloString(frase);
    //   uts.EscribirObjetosArchivo("jugador1.txt",ps);
	}


    public String ataqueMegaman(Megaman enemigo){
        if(Poder==null){
            enemigo.setHP(enemigo.getHP() - 40);
            return 
                    fraseAtaque +  " Megaman " + "40 HP ";
        }else{
            return Poder.ataqueMegaman(enemigo);
        }
       
    }

       
    public String ataqueDittu(Dittu enemigo){
        if(Poder==null){
        enemigo.setHP(enemigo.getHP() - 40);
        return 
                fraseAtaque +  " Dittu " + "40 HP";
        }else{
            return Poder.ataqueDittu(enemigo);
        }
    }

    public String habilidad(){
        int randomNum = 1 + (int)(Math.random() * 3);

            switch(randomNum){
                case 1:
                return transformacionKorby(new Accho());
          
                case 2: 
                return transformacionKorby(new Bobblehead());
     
                case 3:
                return transformacionKorby(new Ninjako());
            }
            return "";
        }

    public String Defensa(){
        defendido = true;
        if(Poder==null){
            return "Korby se defiende";
        }
        return Poder.defensa();
        
    }

    public PoderKorby getPoder(){
        return Poder;
    }

    public String mostrarNombre(){
        return Poder.mostrarNombre();
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

