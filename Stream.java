import java.util.LinkedList;

public class Stream implements Sujeto{

	LinkedList<Espectador> Espectadores = new LinkedList<Espectador>();
	String notificacion;

	public LinkedList<Espectador> getEspectadores(){
		return Espectadores;
	}

	public String getNotificacion(){
		return notificacion;
	}

	public void setnotificacion(String nuevanotificacion){
		notificacion = nuevanotificacion;
	}

	public void registrar(Espectador c){
		Espectadores.add(c);
		System.out.println("****************************************************************"
			+ "\nSe ha registrado al Espectador " + c.getUsuario() 
			+ "****************************************************************");
	}

	public void remover(Espectador c){
		System.out.println("****************************************************************"
			+ "\nSe ha removido al Espectador " + c.getUsuario() 
			+ "****************************************************************");
		Espectadores.remove(c);
	}
	
	public void notificar(){
		if(Espectadores.size() > 0){
			for(Espectador c : Espectadores){
				c.actualizar();
			}
		}
	}
}