package disSoftware.proyectoFinal.model.enemy;

import disSoftware.proyectoFinal.model.Enemy;

public interface EnemyFactory {
	Enemy createIronMan();
    Enemy createSpiderMan();
    Enemy createThor();
    Enemy createCaptainAmerica();
}
