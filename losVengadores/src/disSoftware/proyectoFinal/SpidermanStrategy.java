package disSoftware.proyectoFinal;

public class SpidermanStrategy implements Strategy {
    @Override
    public Integer execute(Enemy self, Character opponent) {
    	
    	int damage = DamageCalculator.getInstance().calculateDamage(self, opponent);
    	if(self.getHealth()<=50) {
	        System.out.println(self.getName() + " lanza telarañas a " + opponent.getName());
	        damage += self.getSpecialNumber();
	        String ultimateText=self.getSpecialText();
	        System.out.println(ultimateText );
	        System.out.println(opponent.getName() + " recibe " + damage + " de daño extra.");
    	}
	        return damage;
    }
}
