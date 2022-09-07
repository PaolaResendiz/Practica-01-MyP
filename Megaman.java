public class Megaman {
    private PoderMegaman Megaman;
    private int HP;
    private void transformacionMegaman(PoderMegaman nuevoPoder){
		Megaman = nuevoPoder;
		System.out.println ("Megaman replica la habilidad de "  + nuevoPoder.getNombre());
	}

    public String mostrarAtaqueMegaman(){
        return Megaman.ataque();
    }

    public String mostrarDefensaMegaman(){
        return Megaman.defensa();
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

    public PoderMegaman getPoder(){
        return Megaman;
    }

    public void setPoder(PoderMegaman nuevoPoder){
        Megaman = nuevoPoder;
    }

    public int getHP(){
        return HP;
    }

    public void setHP(int nuevoHP){
        HP = nuevoHP;
    }

}
