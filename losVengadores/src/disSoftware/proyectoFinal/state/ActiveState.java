package disSoftware.proyectoFinal.state;

import disSoftware.proyectoFinal.model.Character;

public class ActiveState implements State{

	public void handle(Character character) {
	}

	@Override
	public String getName() {
		return "Activo";
	}
}
