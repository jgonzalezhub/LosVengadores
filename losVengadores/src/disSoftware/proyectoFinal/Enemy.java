package disSoftware.proyectoFinal;


public abstract class Enemy extends Character{

	protected Strategy strategy;

	//CONSTRUCTOR
	public Enemy(String name, Integer power,Integer health,Integer defense, String specialText,Integer specialNumber, State state){
		super(name, power, health,defense, specialText, specialNumber, state);
	}
	public void setStrategy(Strategy strategy){
		this.strategy = strategy;
	}


	public void performAction(Player opponent) {
		Integer enemyAction = (int)(Math.random() * 2);

		Integer defense1=0;
		Integer damage2=0;

		DamageCalculator calculator = DamageCalculator.getInstance();

		//Comprobamos el estado




		decideNextStrategy(opponent);
		strategy.execute(this, opponent);
		System.out.println("A " + opponent.getName() + " le queda " + opponent.getHealth()  + " de vida");


	}


	protected abstract void decideNextStrategy(Character opponent);

}
