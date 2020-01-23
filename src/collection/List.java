package collection;

import java.util.ArrayList;
import java.util.stream.Stream;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Une arraylist peut possèder n'importe quel élément
		ArrayList list = new ArrayList();

		list.add(12);
		list.add("Boujour");
		list.add(0.2);
		list.add(true);
		list.add('d');

		for (Object object : list) {
			System.out.println(object);
		}

		//list.get retourne l'élément choisi dans la liste
		System.out.println(list.get(0));

		//add() permet d'ajouter un élément ;

		//remove(int index) efface l'entrée à l'indice demandé ;

		//isEmpty() renvoie « vrai » si l'objet est vide ;

		//removeAll() efface tout le contenu de l'objet ;

		//contains(Object element) retourne « vrai » si l'élément passé en paramètre est dans l'ArrayList.






		//création d'une arraylist avec comme argument un object personne
		ArrayList<Personne> list2 = new ArrayList<Personne>();
		list2.add(new Personne("bob", 12, 30.00, 150.00));
		list2.add(new Personne("toto", 15, 40.00, 160.00));
		list2.add(new Personne("tata", 20, 50.00, 165.00));

		System.out.println(list2.get(0));
		System.out.println();



		Stream<Personne> sp = list2.stream();
		sp = list2.stream();
		sp.	filter(x -> x.getAge() >= 15)
			.forEach(System.out::println);
	}

}
