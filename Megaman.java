public class Megaman {
    private PoderMegaman Megaman;
    private void transformacionMegaman(PoderMegaman nuevoPoder){
		Megaman = nuevoPoder;
		System.out.println ("Megaman replica la habilidad de "  /* nuevoPoder.getNombre() */);
	}

    public String mostrarAtaqueMegaman(){
        return Megaman.ataque();
    }

    public String mostrarDefensaMegaman(){
        return Megaman.defensa();
    }
}
