package creature;

import java.util.ArrayList;
import java.util.List;
import monstersFactory.MonsterClassType;

public abstract class Construtor extends Creature {

	public Construtor(String classe, int defesa, int ataque, int energia, String terreno) {
		super(classe, defesa, ataque, energia, terreno);

	}

	public static List<MonsterClassType> getClasses() {
		List<MonsterClassType> enumClasses = new ArrayList<>();
		enumClasses.add(MonsterClassType.Djinn);
		enumClasses.add(MonsterClassType.Golem);
		enumClasses.add(MonsterClassType.Gargula);

		return enumClasses;

	}

	@Override
	public String toString() {
		String aux = "Classe: " + classe + ", " + "Defesa: " + defesa + ", " + "Ataque: " + ataque + ", " + "Energia: "
				+ energia + ", " + "Terreno: " + terreno;
		return aux;
	}

}
