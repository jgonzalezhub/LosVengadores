package disSoftware.proyectoFinal;

public class World2Factory implements EnemyFactory {

		@Override
		public IronMan createIronMan() {
			return new IronMan();
		}

		@Override
		public SpiderMan createSpiderMan() {
			// TODO Auto-generated method stub
			return new SpiderMan();
		}

		@Override
		public Thor createThor() {
			// TODO Auto-generated method stub
			return new Thor();
		}

		@Override
		public CaptainAmerica createCaptainAmerica() {
			// TODO Auto-generated method stub
			return new CaptainAmerica();
		}

}

