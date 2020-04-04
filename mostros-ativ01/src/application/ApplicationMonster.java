package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import monsters.Creature;
import monstersFactory.MonsterClassType;
import monstersFactory.MonstersFactory;

public class ApplicationMonster {
	public static void main (String [] args) {
		List<MonsterClassType> monsterTypeAvailableList = new ArrayList<>();
		monsterTypeAvailableList.add(MonsterClassType.Djinn);
		monsterTypeAvailableList.add(MonsterClassType.Dopplers);
		monsterTypeAvailableList.add(MonsterClassType.Ghouls);
		monsterTypeAvailableList.add(MonsterClassType.Kikimora);
		monsterTypeAvailableList.add(MonsterClassType.Silvano);
		
		List<Creature> monsterList = new ArrayList<>();
		for (int i = 0; i < 25; i++) {
			Random rand = new Random();
			
			int listSize = monsterTypeAvailableList.size();
			int randomNumber = rand.nextInt(listSize);
			MonsterClassType randomCreatureType = monsterTypeAvailableList.get(randomNumber);

			Creature newCreature =  MonstersFactory.getMonster(randomCreatureType);
			monsterList.add(newCreature);
		}
		for (Creature creature : monsterList) {
			System.out.println(creature.toString());
		}
		
	}
}
