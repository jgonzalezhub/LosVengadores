package disSoftware.proyectoFinal;

public class BasicAttack implements Action {

    public Integer execute(Player attacker, Enemy defender) {
        
    	int baseDamage = DamageCalculator.getInstance().calculateDamage(attacker, defender);
        defender.takeDamage(baseDamage);
        return baseDamage;
    }

    @Override
    public String getDescription() {
        return "Ataque básico";
    }

	
}
