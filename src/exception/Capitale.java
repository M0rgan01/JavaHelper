package exception;

public class Capitale extends Ville{

	private String monument;

	public Capitale() {
		super();
		monument = "aucun";
	}

	public Capitale(String nom, String pays, int hab,String monument) throws NombreHabitantException, NomVilleException {

		super(nom,pays,hab);
		this.monument = monument;
	}


	public String getMonument() {
		return monument;
	}

	public void setMonument(String monument) {
		this.monument = monument;
	}

	public String decrisToi() {
		String str = super.decrisToi() + "\n \t ==>> " + this.monument + " en est un monument";


    return str;
}
}
