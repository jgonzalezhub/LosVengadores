package disSoftware.proyectoFinal;
import java.util.Scanner;


public class Player extends Character{
    //CONSTRUCTOR
    public Player(String name, 
                 Integer power,
                 Integer health,
                 Integer defense,
                 String specialText,
                 Integer specialNumber,
                 State state){
        super(name, power, health,defense, specialText, specialNumber, state);
    }
    
    public void performAction(Enemy opponent) {
    	
    	Integer playerAction=0;
    	Scanner scanner = new Scanner(System.in);
    	Integer defense1 = 0;
    	Integer damage2=0;
    	DamageCalculator calculator = DamageCalculator.getInstance();
		playerAction=scanner.nextInt();
      
		
		
		           
            // Si está paralizado, se podría interrumpir la acción:
            if (state instanceof ParalyzedState) {
                System.out.println(name + " está paralizado y no puede actuar.");
                return;
            }
				switch(playerAction) {
				case 1:
					Action action = new BasicAttack();
					//if (this.power > 50) action = new PowerfulAttack(action);
					if (this.power < 40) action = new LightningAttack(action);
	
					System.out.println(name + " usa: " + action.getDescription());
					Integer totalDamage = action.execute(this, opponent);
					opponent.takeDamage(totalDamage);
					System.out.println(opponent.getName() + " recibe " + totalDamage + " de daño. Vida restante: " + opponent.getHealth());
				break;
				case 2:
					defense1 = calculator.calculateDefense(opponent, this);
					if(defense1==0) {
						System.out.println(this.getName()+" se protege ante el ataque.");
					}else {
						defense1 = calculator.calculateDefense(opponent, this);
						this.setHealth(this.health-defense1);
						System.out.println(opponent.getName()+ " ataca y genera "+ opponent.getPower() + " de daño sobre "+ this.getName());
					}
				break;
				}
			
        
    	
    }
    
}
