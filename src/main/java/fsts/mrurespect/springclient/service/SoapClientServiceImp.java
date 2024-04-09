package fsts.mrurespect.springclient.service;

import org.springframework.stereotype.Service;
import proxy.BanqueService;
import proxy.Compte;

import java.util.List;

@Service
public class SoapClientServiceImp implements SoapClientService{
    BanqueService stub ;

    public SoapClientServiceImp(BanqueService banqueService) {
        stub = banqueService;
    }

    public Compte getCompte(int id) {
        return  stub.getCompte(id);
    }

    public List<Compte> listComptes() {
        return stub.listComptes();
    }

    public double conversion(double amount) {
        return stub.conversion(amount);
    }
}
