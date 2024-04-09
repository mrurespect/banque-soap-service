package fsts.mrurespect.springclient;

import fsts.mrurespect.springclient.service.SoapClientServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import proxy.Compte;

import java.util.List;

@SpringBootApplication
public class SpringclientApplication implements CommandLineRunner {

    @Autowired
    private SoapClientServiceImp soapClientServiceImp;

    public static void main(String[] args) {
        SpringApplication.run(SpringclientApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // Example: Get a single account by ID
        Compte account = soapClientServiceImp.getCompte(1);
        System.out.printf("Account details - Code: %d, Solde: %f\n", account.getCode(), account.getSolde());

        // Example: Get a list of accounts
        List<Compte> accounts = soapClientServiceImp.listComptes();
        System.out.println("List of accounts:");
        for (Compte acc : accounts) {
            System.out.printf("Code: %d, Solde: %f\n", acc.getCode(), acc.getSolde());
        }

        // Example: Perform a currency conversion
        double convertedAmount = soapClientServiceImp.conversion(100);
        System.out.printf("Amount after conversion: %f\n", convertedAmount);
    }
}
