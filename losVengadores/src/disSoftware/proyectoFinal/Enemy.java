package disSoftware.proyectoFinal;


public abstract class Enemy extends Character{
	
    protected Strategy strategy;

    //CONSTRUCTOR
    public Enemy(String name, Integer power,Integer health,Integer defense, String specialText,Integer specialNumber){
        super(name, power, health,defense, specialText, specialNumber);
    }
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    

    public void performAction(Character opponent) {
        Integer enemyAction = (int)(Math.random() * 2);
        
        Integer defense=-1;
        Integer damage2=0;

        DamageCalculator calculator = DamageCalculator.getInstance();
        
        defense = calculator.defense(this, opponent);

		//Comprobamos el estado
		if (state != null) {
            state.handle(this);

            // Si está paralizado, se podría interrumpir la acción:
            if (state instanceof ParalyzedState) {
                System.out.println(name + " está paralizado y no puede actuar.");
                return;
            }else{
				switch(enemyAction) {
				case 1:
                    decideNextStrategy(opponent);
                    strategy.execute(this, opponent);
				break;
				case 2:
					if(defense==0) {
						System.out.println(this.getName()+" se protege ante el ataque");
					}else {
						this.setHealth(opponent.health-calculator.calculateDamage(this,opponent));
						System.out.println(this.getName()+ "ataca y genera "+ calculator.calculateDamage(this,opponent)+ "de daño sobre "+ opponent.getName());
					}
				break;
				}
			}
        }  
    }
    protected abstract void decideNextStrategy(Character opponent);

}
