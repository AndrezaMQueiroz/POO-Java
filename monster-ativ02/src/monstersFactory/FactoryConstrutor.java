package monstersFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import creature.*;
import monsters.Dijnn;
import monsters.Golem;
import monsters.Gargula;

public class FactoryConstrutor extends MonstersFamilyFactory {

	@Override
	public Creature getCriature(MonsterClassType tipo) {
		switch (tipo) {
		case Djinn:
			return new Dijnn(8, 9, 10, "Não possui um terreno.");
		case Golem:
			return new Golem(5, 3, 2, "Pântano");
		case Gargula:
			return new Gargula(3, 6, 1, "Montanhas");
		default:
			break;
		}

		return null;

	}

	public List<MonsterClassType> getClasses() {
		List<MonsterClassType> monsterTypeAvailableList = new ArrayList<>();
		monsterTypeAvailableList.add(MonsterClassType.Djinn);
		monsterTypeAvailableList.add(MonsterClassType.Golem);
		monsterTypeAvailableList.add(MonsterClassType.Gargula);

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
