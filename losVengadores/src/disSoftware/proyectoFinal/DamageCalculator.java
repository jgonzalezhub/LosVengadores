package disSoftware.proyectoFinal;

public class DamageCalculator {
    private static DamageCalculator instance;
    
    private DamageCalculator(){
    }

    public static DamageCalculator getInstance(){
        if(instance == null){
            instance = new DamageCalculator();
        }
        return instance;
    }

    public Integer calculateDamage(Character attacker, Character defender){

        Integer damage;
        damage = attacker.power;

        return damage;
    }
}
