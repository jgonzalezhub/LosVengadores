package disSoftware.proyectoFinal.model;

public class DamageCalculator {
	private static DamageCalculator  instance;
	
	private DamageCalculator() {
		
	}
	public static DamageCalculator getInstance(){
        if(instance == null){
            instance = new DamageCalculator();
        }
        return instance;
    }

    public Integer calculateDamage(Character attacker, Character defender){
        Integer damage;
        damage = attacker.getPower() - defender.getDefense();

        return damage;
    }
    public Integer calculateDefense(Character attacker, Character defender) { // una probabilidad de defenderse parecida a proteccion en pokemon que el jugador tenga un probabilidad de defenderse al completo 
    	int damage;
    	int defenseprobability=(int)(Math.random()*10)+1;
    	if(defenseprobability<5) {
    		damage=0;
    	}else{
    		damage = attacker.getPower() * 2 - defender.getDefense();
    	}
    	return damage;
    }
}
