package exception;

public class Ville {

	private String nomVille;
	private int nbreHabitants;
	private String nomPays;
	private char catégorie;
	private static int nombreInstance;

	public Ville() {
		System.out.println("Création d'une ville");
		nombreInstance++;
		nomVille = "inconnue";
		nomPays = "inconnue";
		nbreHabitants = 0;
		this.setCatégorie();
	}


	public Ville(String pnomVille, String pnomPays, int pnbreHabitants)
			throws NombreHabitantException, NomVilleException {
		if (pnbreHabitants < 0)
			throw new NombreHabitantException(pnbreHabitants);
		if (pnomVille.length() < 3)
			throw new NomVilleException("Le nom de la ville est inférieur à 3 caractère, nom :" + pnomVille);

		else {

			System.out.println("Création d'une ville avec paramètre");
			nombreInstance++;
			nomVille = pnomVille;
			nomPays = pnomPays;
			nbreHabitants = pnbreHabitants;
			this.setCatégorie();
		}
	}


	public static int getNombreInstance() {
		return nombreInstance;
	}

	public String getNomVille() {
		return nomVille;
	}


	public String getNomPays() {
		return nomPays;
	}


	public int getNbreHabitants() {
		return nbreHabitants;
	}


	public char getCatégorie() {
		return catégorie;
	}


	public void setNomVille(String pnomVille) {
		nomVille = pnomVille;
	}


	public void setNompays(String pnomPays) {
		nomPays = pnomPays;
	}


	public void setnbreHabitants(int pnbreHabitants) {
		nbreHabitants = pnbreHabitants;
		this.setCatégorie();
	}


	private void setCatégorie() {
		int bornesSuperieures[] = {0, 1000, 10_000, 100_000, 500_000, 1_000_000, 5_000_000, 10_000_000};
		char catégorie[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

		int i = 0;
		while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
			i++;

		this.catégorie = catégorie[i];
	}


	public String decrisToi() {
		return this.nomVille + " est une ville de " + this.nomPays + ", elle comporte : " + this.nbreHabitants + " habitant(s) => elle est donc de catégorie : " + this.catégorie;
	}


	public String comparer(Ville v1) {
		String str = new String();

		if (v1.getNbreHabitants() > this.nbreHabitants)
			str = v1.getNomVille() + " est une ville plus peuplée que " + this.nomVille;

		else
			str = this.nomVille + " est une ville plus peuplée que " + v1.getNomVille();

		return str;
	}
}

