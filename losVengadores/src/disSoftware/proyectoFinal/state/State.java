package disSoftware.proyectoFinal.state;

import disSoftware.proyectoFinal.model.Character;

public interface State {
    public void handle(Character character);
    public String getName();
}
