package monstersFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import creature.Creature;
import monsters.Silvano;
import monsters.Kernun;
import monsters.Dopplers;

public class FactoryReliction extends MonstersFamilyFactory {

	@Override
	public Creature getCriature(MonsterClassType tipo) {
		switch (tipo) {
		case Silvano:
			return new Silvano(8, 9, 10, "Não possui um terreno.");
		case Kernun:
			return new Kernun(5, 3, 2, "Pântano");
		case Dopplers:
			return new Dopplers(3, 6, 1, "Não possui um terreno.");
		default:
			break;
		}

		return null;

	}

	public List<MonsterClassType> getClasses() {
		List<MonsterClassType> monsterTypeAvailableList = new ArrayList<>();
		monsterTypeAvailableList.add(MonsterClassType.Silvano);
		monsterTypeAvailableList.add(MonsterClassType.Kernun);
		monsterTypeAvailableList.add(MonsterClassType.Dopplers);

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
