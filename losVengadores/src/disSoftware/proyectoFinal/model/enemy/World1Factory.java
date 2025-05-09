package disSoftware.proyectoFinal.model.enemy;

import disSoftware.proyectoFinal.attack.characters.CaptainAmerica;
import disSoftware.proyectoFinal.attack.characters.IronMan;
import disSoftware.proyectoFinal.attack.characters.SpiderMan;
import disSoftware.proyectoFinal.attack.characters.Thor;
import disSoftware.proyectoFinal.model.Enemy;
import disSoftware.proyectoFinal.strategy.CaptainAmericaStrategy;
import disSoftware.proyectoFinal.strategy.IronManStrategy;
import disSoftware.proyectoFinal.strategy.SpidermanStrategy;
import disSoftware.proyectoFinal.strategy.ThorStrategy;

public class World1Factory implements EnemyFactory {

	@Override
	public Enemy createIronMan() {
		Enemy ironMan = new IronMan("Iron-Man", 30, 100,15, "JARVIS CLIP THAT", 30);
		ironMan.setStrategy(new IronManStrategy());
		return ironMan;
	}

	@Override
	public Enemy createSpiderMan() {
		Enemy spiderMan = new SpiderMan("Spider-Man", 30, 80,20, "Don't mess with the amazing Spider-Man", 20);
		spiderMan.setStrategy(new SpidermanStrategy());
		return spiderMan;
	}

	@Override
	public Enemy createThor() {
		Enemy thor = new Thor("Thor: God of Thunder", 35, 120,15, "Behold the God of Thunder", 40);
		thor.setStrategy(new ThorStrategy());
		return thor;
	}

	@Override
	public Enemy createCaptainAmerica() {
		Enemy captainAmerica = new CaptainAmerica("Captain America", 35, 100,20, "AVENGERS ASSEMBLE", 20);
		captainAmerica.setStrategy(new CaptainAmericaStrategy());
		return captainAmerica;
	}
}
