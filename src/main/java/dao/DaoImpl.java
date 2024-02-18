package dao;

public class DaoImpl implements  IDao{

    @Override
    public double getData() {
        //Connect to the database and retrieve temperature
        System.out.println("Database version");
    double temp = Math.random() * 40;
        return temp;
    }
}
