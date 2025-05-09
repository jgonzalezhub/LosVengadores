package disSoftware.proyectoFinal.attack.characters;

import disSoftware.proyectoFinal.model.Character;
import disSoftware.proyectoFinal.model.Enemy;
import disSoftware.proyectoFinal.strategy.CaptainAmericaStrategy;

public class CaptainAmerica extends Enemy {  
	
	public CaptainAmerica(String name,Integer power,Integer health,Integer defense,String specialText,Integer specialNumber){
        super(name, power, health,defense,specialText, specialNumber);
    }
	protected void decideNextStrategy(Character opponent) {
        setStrategy(new CaptainAmericaStrategy());
    }
}
