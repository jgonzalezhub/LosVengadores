package disSoftware.proyectoFinal;

public class DamageCalculator {
	private static DamageCalculator  instance;
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
}
