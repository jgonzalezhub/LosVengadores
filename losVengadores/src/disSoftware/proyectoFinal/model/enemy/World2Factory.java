package disSoftware.proyectoFinal.model.enemy;

import disSoftware.proyectoFinal.attack.characters.CaptainAmerica;
import disSoftware.proyectoFinal.attack.characters.IronMan;
import disSoftware.proyectoFinal.attack.characters.SpiderMan;
import disSoftware.proyectoFinal.attack.characters.Thor;
import disSoftware.proyectoFinal.model.Enemy;

public class World2Factory implements EnemyFactory {

	@Override
	public Enemy createIronMan() {
		Enemy ironMan = new IronMan("Iron-Man", 45, 200,15, "JARVIS CLIP THAT", 30);
		return ironMan;
	}

	@Override
	public Enemy createSpiderMan() {
		Enemy spiderMan = new SpiderMan("Spider-Man", 45, 160,15, "Don't mess with the amazing Spider-Man", 20);
		return spiderMan;
	}

	@Override
	public Enemy createThor() {
		Enemy thor = new Thor("Thor: God of Thunder", 60, 200,10, "Behold the God of Thunder", 40);
		return thor;
	}

	@Override
	public Enemy createCaptainAmerica() {
		Enemy captainAmerica = new CaptainAmerica("Captain America", 65, 190,10, "AVENGERS ASSEMBLE", 20);
		return captainAmerica;
	}
}

