public class Dittu {
    private int HP; 
    private PoderDittu Dittu;
    public void transformacionDittu(PoderDittu nuevoPoder){
		Dittu = nuevoPoder;
		System.out.println ("Dittu replica la habilidad de "  /* nuevoPoder.getNombre() */);
	}

    public String mostrarAtaqueDittu(){
        return Dittu.ataque();
    }

    public String mostrarDefensaDittu(){
        return Dittu.defensa();
    }

    // public void habilidad(){
    //     int randomNum = 1 + (int)(Math.random() * 3);
    //     switch(randomNum){
    //         case 1:
    //         transformacionDittu(new Accho());
    //         break;
    //         case 2: 
    //         transformacionDittu(new Bobblehead());
    //         break;
    //         case 3:
    //         transformacionDittu(new Ninjako());
    //         break;
    //     }
    // }

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
