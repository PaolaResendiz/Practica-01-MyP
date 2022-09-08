public class LaunchOctopus implements PoderMegaman{
	private String nombre = "Launch Octopus";
	private String frase = "Los tentaculos de Octopus absorben la energía del usuario. Infringe 30 HP al contrincante.";
	private int damage = 60;
	private double defensa= 0.7;
	
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
		return "Megaman se cubre con sus tentaculos, defiende 50% de damage";
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