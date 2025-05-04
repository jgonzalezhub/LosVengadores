package disSoftware.proyectoFinal;
import java.util.Scanner;


public class Player extends Character{
    //CONSTRUCTOR
    public Player(String name, 
                 Integer power,
                 Integer health,
                 Integer defense,
                 String specialText,
                 Integer specialNumber){
        super(name, power, health,defense, specialText, specialNumber);
    }
    
    public void performAction(Enemy opponent) {
    	
    	Integer playerAction=0;
    	Scanner scanner = new Scanner(System.in);
    	Integer damage1=0;
    	Integer damage2=0;
    	DamageCalculator calculator = DamageCalculator.getInstance();
		playerAction=scanner.nextInt();
      
		//Comprobamos el estado
		if (state != null) {
            state.handle(this);

            // Si está paralizado, se podría interrumpir la acción:
            if (state instanceof ParalyzedState) {
                System.out.println(name + " está paralizado y no puede actuar.");
                return;
            }else{
				switch(playerAction) {
				case 1:
					Action action = new BasicAttack();
					//if (this.power > 50) action = new PowerfulAttack(action);
					if (this.power < 40) action = new LightningAttack(action);
	
					System.out.println(name + " usa: " + action.getDescription());
					Integer totalDamage = action.execute(this, opponent);
					System.out.println(opponent.getName() + " recibe " + totalDamage + " de daño. Vida restante: " + opponent.getHealth());
				break;
				case 2:
					damage1=calculator.calculateDamage(this,opponent);
					if(damage1==0) {
						System.out.println(this.getName()+" se protege ante el ataque");
					}else {
						this.setHealth(opponent.health-damage1);
						System.out.println(this.getName()+ " ataca y genera "+ damage1+ " de daño sobre "+ opponent.getName());
					}
				break;
				}
			}
        }
    	
    }
    
}
