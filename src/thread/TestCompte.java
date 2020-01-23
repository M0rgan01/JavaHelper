package thread;

public class TestCompte {

	public static void main(String[] args) {
		CompteEnbanque cb = new CompteEnbanque();
		CompteEnbanque cb2 = new CompteEnbanque();
		Thread t = new Thread(new RunImpl(cb2, "emilie" ));
		Thread t2 = new Thread(new RunImpl(cb, "morgan"));


		t.start();
		t2.start();
	}

}
