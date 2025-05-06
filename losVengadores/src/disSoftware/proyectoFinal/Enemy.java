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
        

            // Si está paralizado, se podría interrumpir la acción:
            
				switch(enemyAction) {
				case 1:
                    decideNextStrategy(opponent);
                    strategy.execute(this, opponent);
				break;
				case 2:
					defense1 = calculator.calculateDefense(opponent, this);
					if(defense1==0) {
						System.out.println(this.getName()+" se protege ante el ataque");
					}else {
						defense1 = calculator.calculateDefense(opponent, this);
						this.setHealth(this.health-defense1);
						System.out.println(opponent.getName()+ " ataca y genera "+ opponent.getPower() + " de daño sobre "+ this.getName());
					}
				break;
				}
			}
          
    
    protected abstract void decideNextStrategy(Character opponent);

}
