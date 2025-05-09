package disSoftware.proyectoFinal.model;

import disSoftware.proyectoFinal.state.State;

public class WoundedState implements State{

	@Override
	public void handle(Character character) {
		System.out.println(character.getName() + " está HERIDO.");	
		character.defense = (int) (character.defense * 0.7);
	}

	@Override
	public String getName() {
		return "Wounded";
	}

}
