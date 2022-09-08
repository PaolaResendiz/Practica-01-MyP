public class Velguarder implements PoderMegaman{
	private String nombre = "Velguarder";
	private String frase = "Megaman absorbe el miedo que tenga su oponente y ataca con sus garras de hierro a este. Quita al enemigo ";
	private int damage = 45;
	private double defensa= 0.75;
	
	/* Metodo que regresa el nombre del poder 
	 * @return nombre
	 */
	public String mostrarNombre(){
		return nombre;
	}

	/* Metodo que regresa la defensa del poder 
	 * @return defensa
	 */
	public double mostrarDefensa(){
		return defensa;
	}

	/* Metodo que regresa el damage del poder 
	 * @return damage
	 */
	private int getDamage(){
		return damage;
	}

	/* Metodo que regresa la frase del poder 
	 * @return frase
	 */
	private String getFrase(){
		return frase;
	}

	/* Metodo que modifica el damage del poder
	 * @param damage nuevo damage
	 */
	private void setDamage(int damage){
		this.damage = damage;
	}

	/* Metodo que modifica la frase del poder
	 * @param frase nueva frase
	 */
	private void setFrase(String frase){
		this.frase = frase;
	}

	/* Metodo que modifica la defensa del poder
	 * @param defensa nueva defensa
	 */
	private void setDefensa(double defensa){
		this.defensa = defensa;
	}


	
	/*Método que realisa la defensa segun el poder */
	@Override
	public String defensa(){
		return "Megaman usa una barrera de metal para protegerse, protege 15% del dano";
	}

	/*
	 * Método que realiza el ataque a Megaman
	 * @param enemigo Megaman
	 * @return frase con el ataque
	 */
	@Override
	public String ataqueKorby(Korby enemigo){
		
		PoderKorby poder = enemigo.getPoder();
	
		if(enemigo.getDefendido()){
			if(poder == null){
				enemigo.setHP((int)(enemigo.getHP() - (damage*.8)));
				enemigo.setDefendido(false);
				return
				frase +  " Korby " + damage*defensa + " HP" + "\nEl HP de Korby es " + enemigo.getHP();
			}
			enemigo.setHP((int)(enemigo.getHP() - (damage*poder.mostrarDefensa())));
			enemigo.setDefendido(false);
			return
			frase +  " Korby " + damage*poder.mostrarDefensa() + " HP" + "\nEl HP de Korby es " + enemigo.getHP();
		}else{
				enemigo.setHP(enemigo.getHP() - damage);
				return
				frase +  " Korby " + damage + " HP" + "\nEl HP de Korby es " + enemigo.getHP();
			}
				
    }
       
	/* Método que realiza el ataque a Dittu
	 * @param enemigo Dittu
	 * @return frase con el ataque
	 */
	@Override	
	public String ataqueDittu(Dittu enemigo){
		PoderDittu poder = enemigo.getPoder();
		if(enemigo.getDefendido()){
			if(poder == null){
				enemigo.setHP((int)(enemigo.getHP() - (damage*.8)));
				enemigo.setDefendido(false);
				return
				frase +  " Dittu " + damage*defensa + " HP" + "\nEl HP de Ditttu es " + enemigo.getHP();
			}
			enemigo.setHP((int)(enemigo.getHP() - (damage*poder.mostrarDefensa())));
			enemigo.setDefendido(false);
			return
			frase +  " Dittu " + damage*poder.mostrarDefensa() + " HP" + "\nEl HP de Dittu es " + enemigo.getHP();
		}else{
				enemigo.setHP(enemigo.getHP() - damage);
				return
				frase +  " Dittu " + damage + " HP" + "\nEl HP de Dittu es " + enemigo.getHP();
			}
				
    }
}