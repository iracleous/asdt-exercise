package myclasses;


//singleton
public class StandardServiceFactory implements  ServiceFactory{

    private static StandardServiceFactory standardServiceFactory;
    private StandardServiceFactory(){

    }

    public static ServiceFactory getInstance() {
        if (standardServiceFactory==null)
            standardServiceFactory = new StandardServiceFactory();
        return standardServiceFactory ;
    }
    // factory method
    @Override
    public Service makeService() {
        return new ServiceB();
    }
}
