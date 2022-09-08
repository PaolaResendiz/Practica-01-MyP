public class Espectador implements Observador{
	private String usuario;
	private Stream lider;
	private String notificacion;
	private int numero;

	public Espectador(String usuario, Stream lider){
		this.lider = lider;
		lider.registrar(this);
		notificacion = lider.getNotificacion();
	}
	
	@Override
	public void actualizar(){
		LeerSt uts = new LeerSt();
		EscribirTexto utr = new EscribirTexto();
		notificacion = lider.getNotificacion();
		String ps = uts.LeerString("jugador1.txt") + "\n" + notificacion;
	  System.out.println(ps);
      utr.EscribirString("jugador1.txt",ps);
	}

	public String getUsuario(){
		return usuario;
	}

	public void mostrarDesinteres(){
		lider.remover(this);
	}

	public void vernotificacion(){
		System.out.println("Notificacion"
			+ notificacion);
	}
}