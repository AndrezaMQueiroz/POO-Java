package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import creature.Construtor;
import creature.Creature;
import creature.Insectoide;
import creature.Necrofago;
import creature.Relicto;
import monstersFactory.MonstersFamilyFactory; //Classe familia
import monstersFactory.MonsterClassType; // enum monstros
import monstersFactory.MonsterFamilyClassType; // enum familia

public class Application {
	public static void main(String[] args) {

		Random random = new Random();

		List<MonsterClassType> enumClass = new ArrayList<>();
		
		enumClass.addAll(Construtor.getClasses());
		enumClass.addAll(Insectoide.getClasses());
		enumClass.addAll(Relicto.getClasses());
		enumClass.addAll(Necrofago.getClasses());

		ArrayList<MonsterFamilyClassType> enumFamily = new ArrayList<>();
		enumFamily.add(MonsterFamilyClassType.Necrofago);
		enumFamily.add(MonsterFamilyClassType.Construtor);
		enumFamily.add(MonsterFamilyClassType.Insectoide);
		enumFamily.add(MonsterFamilyClassType.Relicto);
		
		for(int i=1; i<=25 ; i++) {
			MonsterFamilyClassType aleatoryFamily = enumFamily.get(random.nextInt(4));
			MonstersFamilyFactory family = MonstersFamilyFactory.getFactory(aleatoryFamily);
			Creature creatura = family.getRandomCriature();
			System.out.println(i + ". " + creatura);
			
		} 
	}	
}
