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
    public PoderDittu getPoder(){
        return Dittu;
    }

    public void setPoder(PoderDittu nuevoPoder){
        Dittu = nuevoPoder;
    }
}
