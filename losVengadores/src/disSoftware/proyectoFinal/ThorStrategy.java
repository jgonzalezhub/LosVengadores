package disSoftware.proyectoFinal;

public class ThorStrategy implements Strategy {
    @Override
    public Integer execute(Enemy self, Character opponent) {
    	
    	int damage = DamageCalculator.getInstance().calculateDamage(self, opponent);
    	System.out.println("Thor usa su martillo y genera " + self.getPower() + " de daño ");
    	if(self.getHealth()<=30) {
	        System.out.println(self.getName() + " ataca con rayos a " + opponent.getName());
	        damage += self.getSpecialNumber();
	        String ultimateText=self.getSpecialText();
	        System.out.println(ultimateText );
	        System.out.println(opponent.getName() + " recibe " + damage + " de daño extra.");
    	}
		opponent.takeDamage(damage);
	        return damage;
    }
}
