package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2{
    public static void main(String[] args) throws Exception {
        //
        Scanner scanner = new Scanner(new File("config.text"));
        //get className
        String daoClassName = scanner.nextLine();
        //load class into memory
        Class cDao = Class.forName(daoClassName);
        // dynamic instantiation
        IDao dao = (IDao) cDao.newInstance();
        System.out.println("Result1="  + dao.getData());

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();
        //create setDao(dao) method
        Method method = cMetier.getMethod("setDao", IDao.class);
        //dynamic dependency injection
        method.invoke(metier, dao);
        System.out.println("Result2= " + metier.calcul());

    }
}
