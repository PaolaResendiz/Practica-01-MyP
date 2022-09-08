
public class Accho implements PoderKorby{
	private String nombre = "accho";
	private String frase = "Korby lanza una llama de fuego y quita al contrincante";
	private int damage = 45;
	private double defensa= 0.5;
	
	/* Metodo que regresa el nombre del poder 
	 * @return nombre
	 */
	public String getNombre(){
		return nombre;
	}

	/* Metodo que regresa la defensa del poder 
	 * @return defensa
	 */
	public double getDefensa(){
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
		return "Korby se defiende con un escudo de fuego, defiende 50% de daño";
	}

	/*
	 * Método que realiza el ataque a Megaman
	 * @param enemigo Megaman
	 * @return frase con el ataque
	 */
	@Override
	public String ataqueMegaman(Megaman enemigo){
		PoderMegaman poder = enemigo.getPoder();
		if(enemigo.getDefendido()){
			enemigo.setHP(enemigo.getHP() - (damage/2));
			enemigo.setDefendido(false);
			return
			frase +  " Megaman " + damage/2 + " HP" + "\nEl HP de Megaman es " + enemigo.getHP();
		}else{
				enemigo.setHP(enemigo.getHP() - damage);
				return
				frase +  " Megaman " + damage + " HP" + "\nEl HP de Megaman es " + enemigo.getHP();
			}
				
    }
       
	
	/* Método que realiza el ataque a Dittu
	 * @param enemigo Dittu
	 * @return frase con el ataque
	 */
	@Override	
	public String ataqueDittu(Dittu enemigo){
		if(enemigo.getDefendido()){
			enemigo.setHP(enemigo.getHP() - (damage/2));
			enemigo.setDefendido(false);
			return
			frase +  " Dittu " + damage/2 + " HP" + "\nEl HP de Dittu es " + enemigo.getHP();
		}else{
				enemigo.setHP(enemigo.getHP() - damage);
				return
				frase +  " Dittu " + damage + " HP" + "\nEl HP de Dittu es " + enemigo.getHP();
			}
				
    }

}