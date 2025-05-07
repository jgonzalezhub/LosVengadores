package disSoftware.proyectoFinal;

public class World1Factory implements EnemyFactory {

	@Override
	public Enemy createIronMan() {
		Enemy ironMan = new IronMan("Iron-Man", 40, 100,10, "JARVIS CLIP THAT", 30, null);
		ironMan.setStrategy(new IronManStrategy());
		return ironMan;
	}

	@Override
	public Enemy createSpiderMan() {
		Enemy spiderMan = new SpiderMan("Spider-Man", 40, 80,10, "Don't mess with the amazing Spider-Man", 20, null);
		spiderMan.setStrategy(new SpidermanStrategy());
		return spiderMan;
	}

	@Override
	public Enemy createThor() {
		Enemy thor = new Thor("Thor: God of Thunder", 30, 120,10, "Behold the God of Thunder", 40, null);
		thor.setStrategy(new ThorStrategy());
		return thor;
	}

	@Override
	public Enemy createCaptainAmerica() {
		Enemy captainAmerica = new CaptainAmerica("Captain America", 40, 100,10, "AVENGERS ASSEMBLE", 20, null);
		captainAmerica.setStrategy(new CaptainAmericaStrategy());
		return captainAmerica;
	}
}
