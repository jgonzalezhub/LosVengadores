package disSoftware.proyectoFinal;

public class PlayerFactory implements PlayerFactoryInterface {

	@Override
	public Player createIronMan() {
		IronManPlayer ironMan = new IronManPlayer("Iron-Man", 45, 100,20, "JARVIS CLIP THAT", 90, null);
		return ironMan;
	}

	@Override
	public Player createSpiderMan() {
		Player spiderMan = new SpiderManPlayer("Spider-Man", 40, 80,20, "Don't mess with the amazing Spider-Man", 80, null);
		return spiderMan;
	}

	@Override
	public Player createThor() {
		Player thor = new ThorPlayer("Thor: God of Thunder", 30, 120,20, "Behold the God of Thunder", 60, null);
		return thor;
	}

	@Override
	public Player createCaptainAmerica() {
		Player captainAmerica = new CaptainAmericaPlayer("Captain America", 50, 100,20, "AVENGERS ASSEMBLE", 100, null);
		return captainAmerica;
	}
}
