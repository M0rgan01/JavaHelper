package stream;//Et une classe de test :
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<personne> listP = Arrays.asList(
				new personne(1.80, 70, "A", "Nicolas", Couleur.BLEU),
				new personne(1.56, 50, "B", "Nicole", Couleur.VERRON),
				new personne(1.75, 65, "C", "Germain", Couleur.VERT),
				new personne(1.68, 50, "D", "Michel", Couleur.ROUGE),
				new personne(1.96, 65, "E", "Cyrille", Couleur.BLEU),
				new personne(2.10, 120, "F", "Denis", Couleur.ROUGE),
				new personne(1.90, 90, "G", "Olivier", Couleur.VERRON)
		);



		//les streams permettes de parcourir les élément d'un tableau en 2 ligne de code
		Stream<personne> sp = listP.stream();
		sp.forEach(System.out::println);

		//ils permettent aussi de réalisé des filtres très puissant

		System.out.println("\nAprès le filtre");
		//il faut réinstancier le stream, car un stream est a usage unique
		sp = listP.stream();
		sp.	filter(x -> x.getPoids() > 50)
			.forEach(System.out::println);

		//map récupère uniquement les données qui nous intéresse
		System.out.println("\nAprès le filtre et le map");
		sp = listP.stream();
		sp.	filter(x -> x.getPoids() > 50)
			.map(x -> x.getPoids())
			.forEach(System.out::println);

		//reduce nous donne la somme de toute donnée demandé
		System.out.println("\nAprès le filtre et le map et reduce");
		sp = listP.stream();
		Double sum = sp	.filter(x -> x.getPoids() > 50)
						.map(x -> x.getPoids())
						.reduce(0.0d, (x,y) -> x+y);
		System.out.println(sum);


		//nous pouvons également mettre une sécurité si la valeur est impossible a trouver
		System.out.println("\nAprès le filtre et le map et reduce");
		sp = listP.stream();
		Optional<Double> sum2 = sp	.filter(x -> x.getPoids() > 250)
									.map(x -> x.getPoids())
									.reduce((x,y) -> x+y);
		if(sum2.isPresent())
			System.out.println(sum2.get());
		else
			System.out.println("Aucun aggrégat de poids...");


		//cont nous donne le nombre d'élément restant après les opérations
		sp = listP.stream();
		long count = sp	.filter(x -> x.getPoids() > 50)
						.map(x -> x.getPoids())
						.count();

		System.out.println("Nombre d'éléments : " + count);




		//Collect nous permet de convertir notre résultat en list
		sp = listP.stream();
		List<Double> ld = sp.filter(x -> x.getPoids() > 50)
							.map(x -> x.getPoids())
							.collect(Collectors.toList());
		System.out.println(ld);
	}
}
