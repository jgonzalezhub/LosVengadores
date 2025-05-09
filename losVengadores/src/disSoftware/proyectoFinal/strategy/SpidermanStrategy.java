package disSoftware.proyectoFinal.strategy;

import disSoftware.proyectoFinal.model.Character;
import disSoftware.proyectoFinal.model.DamageCalculator;
import disSoftware.proyectoFinal.model.Enemy;

public class SpidermanStrategy implements Strategy {
    @Override
    public Integer execute(Enemy self, Character opponent) {
    	
    	int damage = DamageCalculator.getInstance().calculateDamage(self, opponent);
    	System.out.println("Spiderman pega un combo de puñetazos y genera " + self.getPower() + " de daño"); 
    	if(self.getHealth()<=30) {
    		System.out.println("Como esta herido recurre a su movimiento definitivo ");
	        System.out.println(self.getName() + " lanza telarañas a " + opponent.getName());
	        damage += self.getSpecialNumber();
	        String ultimateText=self.getSpecialText();
	        System.out.println(ultimateText );
	        System.out.println(opponent.getName() + " recibe " + damage );
    	}
		opponent.takeDamage(damage);
	    return damage;
    }
}
