package exception;

public class ClassTest {

	public static void main(String[] args) {


		Ville v = null;

		try {
		  v = new Ville("Ren","France",12000);
		}

		//Gestion de l'exception sur le nombre d'habitants
		catch (NombreHabitantException e) {
		  e.printStackTrace();
		}

		//Gestion de l'exception sur le nom de la ville
		catch(NomVilleException e2){
		  System.err.println(e2.getMessage());
		}
		finally{
		  if(v == null)
		    v = new Ville();
		}

		System.out.println(v.decrisToi());

		}


	}







