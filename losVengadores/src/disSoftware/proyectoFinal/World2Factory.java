package disSoftware.proyectoFinal;

public class World2Factory implements EnemyFactory {

	@Override
	public Enemy createIronMan() {
		Enemy ironMan = new IronMan("Iron-Man", 20, 100,40, "JARVIS CLIP THAT", 30);
		return ironMan;
	}

	@Override
	public Enemy createSpiderMan() {
		Enemy spiderMan = new SpiderMan("Spider-Man", 40, 80,35, "Don't mess with the amazing Spider-Man", 20);
		return spiderMan;
	}

	@Override
	public Enemy createThor() {
		Enemy thor = new Thor("Thor: God of Thunder", 30, 120,50, "Behold the God of Thunder", 40);
		return thor;
	}

	@Override
	public Enemy createCaptainAmerica() {
		Enemy captainAmerica = new CaptainAmerica("Captain America", 40, 100,40, "AVENGERS ASSEMBLE", 20);
		return captainAmerica;
	}
}

