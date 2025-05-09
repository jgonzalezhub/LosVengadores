package disSoftware.proyectoFinal.strategy;

import disSoftware.proyectoFinal.model.Character;
import disSoftware.proyectoFinal.model.Enemy;

public interface Strategy {
    Integer execute(Enemy self, Character opponent);
}
