package monstersFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import creature.Creature;
import monsters.Kikimora;
import monsters.Harrisi;
import monsters.Arachno;

public class FactoryInsectoide extends MonstersFamilyFactory {

	@Override
	public Creature getCriature(MonsterClassType tipo) {
		switch (tipo) {
		case Kikimora:
			return new Kikimora(8, 9, 10, "Não possui um terreno.");
		case Harrisi:
			return new Harrisi(5, 3, 2, "Pântano");
		case Arachno:
			return new Arachno(3, 6, 1, "Não possui um terreno.");
		default:
			break;
		}

		return null;
	}

	public List<MonsterClassType> getClasses() {
		List<MonsterClassType> monsterTypeAvailableList = new ArrayList<>();
		monsterTypeAvailableList.add(MonsterClassType.Kikimora);
		monsterTypeAvailableList.add(MonsterClassType.Harrisi);
		monsterTypeAvailableList.add(MonsterClassType.Arachno);

		return monsterTypeAvailableList;
	}

	@Override
	public Creature getRandomCriature() {
		Random random = new Random();
		List<MonsterClassType> familyList = getClasses();
		MonsterClassType monsterClassType = familyList.get(random.nextInt(familyList.size()));

		return getCriature(monsterClassType);
	}

}
