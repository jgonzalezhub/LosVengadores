package disSoftware.proyectoFinal;

public class CaptainAmericaStrategy implements Strategy {
    @Override
    public Integer execute(Enemy self, Character opponent) {
        
    	int damage = DamageCalculator.getInstance().calculateDamage(self, opponent);
    	System.out.println("Capitan America da una serie de golpes y genera " + self.getPower() + " de daño");
    	if(self.getHealth()<=50) {
    		System.out.println(self.getName() + " usa su escudo contra " + opponent.getName());    		
	        damage += self.getSpecialNumber();
	        String ultimateText=self.getSpecialText();
	        System.out.println(ultimateText );
	        System.out.println(opponent.getName() + " recibe " + damage + " de daño extra.");
        }
		opponent.takeDamage(damage);
        return damage;
    }
}
