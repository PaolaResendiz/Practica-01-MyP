public class Suicune implements PoderDittu{
	private String nombre = "Suicune";
	private String frase = "Ditto utiliza unos colmillos que al morder convierte en hielo al contrincante. Quita al contrincante";
	
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
		return "Dittu antepone una barrera de hielo, defiende 15% de damage";
	}

	/*
	 * Método que realiza el ataque a Megaman
	 * @param enemigo Korby
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
	 * @param enemigo Megaman
	 * @return frase con el ataque
	 */
	@Override	
	public String ataqueMegaman(Megaman enemigo){
		PoderMegaman poder = enemigo.getPoder();
		if(enemigo.getDefendido()){
			if(poder == null){
				enemigo.setHP((int)(enemigo.getHP() - (damage*.8)));
				enemigo.setDefendido(false);
				return
				frase +  " Megaman " + damage*defensa + " HP" + "\nEl HP de Megaman es " + enemigo.getHP();
			}
			enemigo.setHP((int)(enemigo.getHP() - (damage*poder.mostrarDefensa())));
			enemigo.setDefendido(false);
			return
			frase +  " Megaman " + damage*poder.mostrarDefensa() + " HP" + "\nEl HP de Megaman es " + enemigo.getHP();
		}else{
				enemigo.setHP(enemigo.getHP() - damage);
				return
				frase +  " Megaman " + damage + " HP" + "\nEl HP de Megaman es " + enemigo.getHP();
			}
				
    }
}