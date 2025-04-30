package disSoftware.proyectoFinal;

public class World1Factory implements EnemyFactory {

	@Override
	public IronMan createIronMan() {
		return new IronMan();
	}

	@Override
	public SpiderMan createSpiderMan() {
		return new SpiderMan();
	}

	@Override
	public Thor createThor() {
		return new Thor();
	}

	@Override
	public CaptainAmerica createCaptainAmerica() {
		return new CaptainAmerica();
	}
}
