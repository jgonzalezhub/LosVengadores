package disSoftware.proyectoFinal;

public class IronManStrategy implements Strategy {
    @Override
    public Integer execute(Enemy self, Character opponent) {
    	
    	int damage = DamageCalculator.getInstance().calculateDamage(self, opponent);
    	System.out.println("Iron Man dispara de su cañon de energia y genera " + self.getPower() + " de daño");
    	if(self.getHealth()<=30) {
    		System.out.println("Como esta herido recurre a su movimiento definitivo ");
	        System.out.println(self.getName() + " usa su unirayo a " + opponent.getName());
	        damage += self.getSpecialNumber();
	        String ultimateText=self.getSpecialText();
	        System.out.println(ultimateText );
	        System.out.println(opponent.getName() + " recibe " + damage);
    	}
		opponent.takeDamage(damage);
	    return damage;
    }
}
