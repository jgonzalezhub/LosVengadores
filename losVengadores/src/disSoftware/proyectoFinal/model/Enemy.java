package disSoftware.proyectoFinal.model;

import disSoftware.proyectoFinal.state.ParalyzedState;
import disSoftware.proyectoFinal.strategy.Strategy;

public abstract class Enemy extends Character{

	protected Strategy strategy;

	//CONSTRUCTOR
	public Enemy(String name, Integer power,Integer health,Integer defense, String specialText,Integer specialNumber){
		super(name, power, health,defense, specialText, specialNumber);
	}
	public void setStrategy(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void performAction(Player opponent) {
		if (state != null) {
		    state.handle(this);

		    if (state instanceof ParalyzedState) {
		        return; 
		    }
		}
		decideNextStrategy(opponent);
		strategy.execute(this, opponent);
		System.out.println("A " + opponent.getName() + " le queda " + opponent.getHealth()  + " de vida");
	}
	protected abstract void decideNextStrategy(Character opponent);

}
