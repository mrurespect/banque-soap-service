import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub =new  BanqueWS().getBanqueServicePort();
        System.out.printf(stub.conversion(100)+"\n");
        Compte cp = stub.getCompte(1);
        System.out.printf("Code : %d, Solde : %f\n", cp.getCode(), cp.getSolde());
        System.out.printf(stub.listComptes().toString());
    }
}
