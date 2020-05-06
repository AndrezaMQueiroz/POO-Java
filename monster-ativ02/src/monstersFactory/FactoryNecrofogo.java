package monstersFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import creature.*;
import monsters.Ghouls;
import monsters.Necroso;
import monsters.Nevoloso;

public class FactoryNecrofogo extends MonstersFamilyFactory {

	@Override
	public Creature getCriature(MonsterClassType tipo) {
		switch (tipo) {
		case Ghouls:
			return new Ghouls(8, 3, 10, "Cemitério");
		case Necroso:
			return new Necroso(5, 3, 8, "Cemitério");
		case Nevoloso:
			return new Nevoloso(3, 1, 1, "Cemitério");
		default:
			break;
		}
		return null;
	}

	public List<MonsterClassType> getClasses() {
		List<MonsterClassType> monsterTypeAvailableList = new ArrayList<>();
		monsterTypeAvailableList.add(MonsterClassType.Ghouls);
		monsterTypeAvailableList.add(MonsterClassType.Necroso);
		monsterTypeAvailableList.add(MonsterClassType.Nevoloso);

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

