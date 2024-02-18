package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    //weak coupling : depends only on Interfaces
    private IDao dao;  //dependency

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    public MetierImpl() {}

    @Override
    public double calcul() {
        //random business algo
        double temp = dao.getData();
        double res = temp * 956 / Math.cos(temp * Math.PI);
        return res;
    }

    /*
        - we need to inject a IDao variable type in dao object (dependency injection)
    */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
