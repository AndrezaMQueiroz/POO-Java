package monstersFactory;

import creature.Creature;

public abstract class MonstersFamilyFactory {
	
	public static MonstersFamilyFactory getFactory (MonsterFamilyClassType tipo) {
		switch (tipo) {
		case Necrofago:
			return new FactoryNecrofogo();
		case Construtor:
			return new FactoryConstrutor();
		case Relicto:
			return new FactoryReliction ();
		case Insectoide:
			return new FactoryInsectoide ();
			}
			return null;
	}
	
public abstract Creature getCriature(MonsterClassType tipo);
	
	public abstract Creature getRandomCriature();
	
	

}
