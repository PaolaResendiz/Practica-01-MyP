import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Espectador implements Observador{
	private String usuario;
	private Stream lider;
	private String notificacion;
	private int numero;

	public Espectador(String usuario, Stream lider, int numero){
		this.lider = lider;
		this.usuario = usuario;
		this.numero = numero;
		lider.registrar(this);
		notificacion = lider.getNotificacion();
	}
	
	@Override
	public void actualizar(){
		notificacion = lider.getNotificacion();
		EscribirTexto utr = new EscribirTexto();
		BufferedReader br = null;
		BufferedReader br2 = null;
		try{	
			br = new BufferedReader(new FileReader("jugador1.txt"));		
 
			//One way of reading the file
		// System.out.println("Reading the file using readLine() method:");
		String contentLine = br.readLine();
		String completo = "";	
		while (contentLine != null) {
		   completo += contentLine + "\n";
		   contentLine = br.readLine();
		}
		// System.out.println(completo);
		utr.EscribirString("jugador"+numero+".txt",completo + notificacion);
	}catch (IOException ioe) 
		{
		ioe.printStackTrace();
		} 
		finally 
		{
		try {
		   if (br != null)
		  br.close();
		   if (br2 != null)
		  br2.close();
		} 
		catch (IOException ioe) 
			{
		 System.out.println("Error in closing the BufferedReader");
		}
	 }
		// System.out.println(ps);
     
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