package creature;

import java.util.ArrayList;
import java.util.List;

import monstersFactory.MonsterClassType;

public abstract class Relicto extends Creature {

	public Relicto(String classe, int defesa, int ataque, int energia, String terreno) {
		super(classe, defesa, ataque, energia, terreno);

	}

	public static List<MonsterClassType> getClasses() {
		List<MonsterClassType> enumClasses = new ArrayList<>();
		enumClasses.add(MonsterClassType.Silvano);
		enumClasses.add(MonsterClassType.Kernun);
		enumClasses.add(MonsterClassType.Dopplers);

		return enumClasses;

	}

	@Override
	public String toString() {
		String aux = "Classe: " + classe + ", " + "Defesa: " + defesa + ", " + "Ataque: " + ataque + ", " + "Energia: "
				+ energia + ", " + "Terreno: " + terreno;
		return aux;
	}
}
