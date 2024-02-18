package extension;

import dao.IDao;

public class DaoImpl2 implements IDao {

    @Override
    public double getData(){
        System.out.println("Captures version");
        double temp=25;
        return temp;
    }
}
