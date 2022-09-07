public class Espectador implements Observador{
	private String usuario;
	private Stream lider;
	private String notificacion;

	public Espectador(String usuario, Stream lider){
		this.lider = lider;
		lider.registrar(this);
		notificacion = lider.getnotificacion();
	}
	
	@Override
	public void actualizar(){
		notificacion = lider.getnotificacion();
		vernotificacion();
	}

	public String getUsuario(){
		return usuario;
	}

	public void mostrarDesinteres(){
		lider.remover(this);
	}

	public void vernotificacion(){
		System.out.println("FAMILIA: " + familia 
			+ "\nCASA: " + id_Casa
			+ "\nEl lider ha publicado las notificacions del dia: \n" 
			+ notificacion);
	}
}