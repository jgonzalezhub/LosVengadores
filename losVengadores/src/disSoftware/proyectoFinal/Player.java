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
    	String input="";
    	DamageCalculator calculator = DamageCalculator.getInstance();
		//playerAction=scanner.nextInt();
      
		
		

		//Comprobamos el estado
		if (state == null) {            
            // Si está paralizado, se podría interrumpir la acción:
            if (state instanceof ParalyzedState) {
                System.out.println(name + " está paralizado y no puede actuar.");
                return;
            }else{
            	while(playerAction!= 1 || playerAction!=2){
            		input=scanner.nextLine();
            		
            		try {
            	        playerAction = Integer.parseInt(input);
            	    } catch (NumberFormatException e) {
            	        System.out.println("Entrada inválida. Por favor, introduce un número entre 1 y 2.");
            	        continue;
            	    }
            		
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
    					defense1 = calculator.calculateDefense(opponent, this);
    					if(defense1==0) {
    						System.out.println(this.getName()+" se protege ante el ataque.");
    					}else {
    						defense1 = calculator.calculateDefense(opponent, this);
    						this.setHealth(this.health-defense1);
    						System.out.println(opponent.getName()+ " ataca y genera "+ opponent.getPower() + " de daño sobre "+ this.getName());
    					}
    				break;
    				default:
    					System.out.println("Entrada inválida. Por favor, introduce un número entre 1 y 2.");
    				break;
    				}
            	}
            }
        }
    }
    
}
