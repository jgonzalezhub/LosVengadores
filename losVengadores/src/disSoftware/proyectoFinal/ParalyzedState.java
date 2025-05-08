package disSoftware.proyectoFinal;

public class ParalyzedState implements State{
	
	private Integer turnsRemaining= 1;

	@Override
	public void handle(Character character) {
		System.out.println(character.getName()+ "esta PARALIZADO y pierde 1 turno.");
		turnsRemaining--;
		if(turnsRemaining <= 0) {
			character.setState(null);
			System.out.println(character.getName() + "se ha recuperado de la parálisis.");
		}
	}

	@Override
	public String getName() {
		return "Paralizado";
	}

}
