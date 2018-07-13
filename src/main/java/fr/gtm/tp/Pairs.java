package fr.gtm.tp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 
 * <h2>Etapes par étapes :</h2>
 * 
 * <ul>
 * 
 * <li>Créer un nouveau projet Maven avec dépendence à JUnit</li>
 * 
 * <li>Créer une classe Paires.java (ne pas utiliser le default package!)</li>
 * 
 * <li>Implémenter une méthode capable de renvoyer une très grande suite de
 * 
 * chiffres aléatoires.</li>
 * 
 * <li>Implémenter une méthode capable de donner le nombre de paires de chiffres
 * 
 * dans une chaine. Ex: "13483103" -> il y a 2 paires.</li>
 * 
 * </ul>
 * 
 * 
 * 
 * @author Adminl
 *
 * 
 * 
 */

public class Pairs {

	// solution 1
	// public static void main(String[] args) {
	//
	// String suite = "";
	// final Random rand = new Random();
	// for (int i = 0; i < 2; i++) {
	// suite += Math.abs(rand.nextInt());
	// }
	// System.out.println("suite de chiffres : " + suite);
	// System.out.println("Nombre de paires total : " +
	// Pairs.solutionNormale(suite));
	// }
	//
	// private static long solutionNormale(final String suite) {
	// final List<String> list = Arrays.asList(suite.split(""));
	// Collections.sort(list);
	// long total = 0;
	// int precedent = -1;
	// for (final String str : list) {
	// final int i = Integer.parseInt(str);
	// if (precedent < 0 || i != precedent) {
	// precedent = i;
	// } else {
	// ++total;
	// precedent = -1;
	// }
	// }
	// return total;
	//
	// }
	
	

	// solution 2
	public static void main(String[] args) {
		Pairs app = new Pairs();
		List<Integer> randomNumbers = app.generateRandomNumbers1();
		app.countPairs1(randomNumbers);

	}

	public List<Integer> generateRandomNumbers1() {
		int i;
		int k;
		List<Integer> list = new ArrayList<Integer>();
		for (i = 0; i < 20; i++) {
			k = (int) (Math.random() * 10);
			System.out.println(k);
			list.add(k);
		}
		System.out.println("Liste = " + list);
		return list;
	}

	public void countPairs1(List<Integer> listes) {
		int x;
		int y;
		int nbPairs = 0;
		List<Integer> listChiffreTemp = listes;
		for (y = 0; y < listChiffreTemp.size(); y++) {
			for (x = y + 1; x < listChiffreTemp.size(); x++) {
				if (listChiffreTemp.get(y) == listChiffreTemp.get(x)) {
					nbPairs++;
					listChiffreTemp.remove(x);
					listChiffreTemp.remove(y);
					y = 0;
					System.out.println("nbPairs = " + nbPairs);
				}
			}
		}
		System.out.println("Dans cette suite de chiffres, il y a " + nbPairs + " de paires");
	}

}
