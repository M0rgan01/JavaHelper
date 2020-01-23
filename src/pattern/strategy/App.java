package pattern.strategy;

import Exemple1.*;
import Exemple2.character.Personnage;
import Exemple2.character.Reine;
import Exemple2.character.Roi;
import Exemple2.weapons.Poignard;

public class App {

    public static void main(String[] args) throws Exception {
    /*    Context context = new Context();
        context.process();

        System.out.println("-------------------------------");
        context.setiStrategy(new StrategyImpl1());
        context.process();
        System.out.println("-------------------------------");
        context.setiStrategy(new StrategyImpl2());
        context.process();
        System.out.println("-------------------------------");
        context.setiStrategy(new StrategyImpl3());
        context.process();

        boolean fin = false;
        Scanner scanner = new Scanner(System.in);
        while (!fin) {
            System.out.println("Donner la stratégie :");
            String strategyClassName = scanner.nextLine();
            try {
                IStrategy strategy = (IStrategy) Class.forName(strategyClassName).newInstance();
                System.out.println("-------------------------------");
                context.setiStrategy(strategy);
                context.process();
                fin = true;
            } catch (ClassNotFoundException e) {
                System.out.println("Introuvable");
            }

        }*/


        Personnage personnage = new Roi();
        personnage.combattre();
        personnage.setArme(new Poignard());
        personnage.combattre();
        System.out.println("------------------------");

        Personnage personnage2 = new Reine();
        personnage2.combattre();
        personnage2.combattre();

    }
}
