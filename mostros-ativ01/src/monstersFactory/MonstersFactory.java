package monstersFactory;

import monsters.*;

public class MonstersFactory {

	public static Creature getMonster(MonsterClassType tipo) {
		switch (tipo) {
		case Ghouls:
			return new Ghouls(0, 2, 3, "Cemitério");
		case Djinn:
			return new Djinn(8, 9, 10, "Não possui um terreno.");
		case Silvano:
			return new Silvano( 5, 7, 3, "Fazendas");
		case Kikimora:
			return new Kikimora(7, 8, 3, "Pântano");
		case Dopplers:
			return new Dopplers(5, 7, 6, "Não possui terreno.");
		}
			return null;
	}
}
