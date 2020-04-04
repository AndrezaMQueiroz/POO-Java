package monstersFactory;

import monsters.*;

public class MonstersFactory {

	public static Creature getMonster(MonsterClassType tipo) {
		switch (tipo) {
		case Ghouls:
			return new Ghouls(0, 2, 3, "Cemit�rio");
		case Djinn:
			return new Djinn(8, 9, 10, "N�o possui um terreno.");
		case Silvano:
			return new Silvano( 5, 7, 3, "Fazendas");
		case Kikimora:
			return new Kikimora(7, 8, 3, "P�ntano");
		case Dopplers:
			return new Dopplers(5, 7, 6, "N�o possui terreno.");
		}
			return null;
	}
}
