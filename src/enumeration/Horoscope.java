package enumeration;

public class Horoscope {

// enum est une classe déclarant des objects statiques et constants
	enum Days {
		LUNDI,MARDI,MERCREDI,JEUDI,VENDREDI,SAMEDI,DIMANCHE;

	}

	private Days days;

	public void setDays (Days days) {
		this.days = days;
	}

	public void getInfo () {
		switch (days) {
		case LUNDI:
		System.out.println("Une belle journ�e");
		break;
		case MARDI:
		case MERCREDI:
		System.out.println("De la chance de partout");
		break;
		case JEUDI:
		System.out.println("Journ�e pourrie");
		break;
		case VENDREDI:
		case SAMEDI:
		case DIMANCHE:
		System.out.println("Le Week End !!! :)");
		break;

		}
	}


	public static void main(String[] args) {

//		Horoscope h = new Horoscope();
//		h.setDays(Days.LUNDI);
//		h.getInfo();
//		h.setDays(Days.MARDI);
//		h.getInfo();
//		h.setDays(Days.MERCREDI);
//		h.getInfo();

		Language m = Language.JAVA;
		m.getEditor();
		System.out.println(m.toString());

	}

}
