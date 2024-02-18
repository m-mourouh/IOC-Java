package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        /*
            - Dependency injection by static instantiation => new => not a good practice❌
            - new keyword : indicates strong coupling
        */
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(dao);
        System.out.println("Result=" + metier.calcul());
    }
}
