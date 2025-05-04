package disSoftware.proyectoFinal;

public class PlayerFactory implements PlayerFactoryInterface {

	@Override
	public Player createIronMan() {
		IronManPlayer ironMan = new IronManPlayer("Iron-Man", 40, 100,40, "JARVIS CLIP THAT", 30);
		return ironMan;
	}

	@Override
	public Player createSpiderMan() {
		Player spiderMan = new SpiderManPlayer("Spider-Man", 40, 80,35, "Don't mess with the amazing Spider-Man", 20);
		return spiderMan;
	}

	@Override
	public Player createThor() {
		Player thor = new ThorPlayer("Thor: God of Thunder", 30, 120,50, "Behold the God of Thunder", 40);
		return thor;
	}

	@Override
	public Player createCaptainAmerica() {
		Player captainAmerica = new CaptainAmericaPlayer("Captain America", 40, 100,40, "AVENGERS ASSEMBLE", 20);
		return captainAmerica;
	}
}
