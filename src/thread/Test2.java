package thread;

public class Test2 {
public static void main(String[] args) {


Test t = new Test("A");
Test t2 = new Test(" B", t);
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("statut du tread " + t.getName() +" = " + t.getState());
System.out.println("statut du tread " + t2.getName() +" = " + t2.getState());
}
}
