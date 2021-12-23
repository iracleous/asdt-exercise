package myclasses;


//singleton
public class PremiumServiceFactory implements  ServiceFactory{

    private static PremiumServiceFactory premiumServiceFactory;
    private PremiumServiceFactory(){

    }

    public static ServiceFactory getInstance() {
        if (premiumServiceFactory==null)
            premiumServiceFactory = new PremiumServiceFactory();
        return premiumServiceFactory ;
    }

    //factory method
    @Override
    public Service makeService() {
        return new ServiceA();
    }
}
