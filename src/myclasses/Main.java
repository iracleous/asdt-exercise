package myclasses;

import myclasses.PremiumServiceFactory;
import myclasses.Service;
import myclasses.ServiceFactory;
import myclasses.StandardServiceFactory;

public class Main {

    public static void main(String a[]) {
        ServiceFactory psf = PremiumServiceFactory.getInstance();
        ServiceFactory ssf = StandardServiceFactory.getInstance();
        Service s1 = psf.makeService();
        Service s2 = ssf.makeService();

        s1.serve();
        s2.serve();
    }
}
