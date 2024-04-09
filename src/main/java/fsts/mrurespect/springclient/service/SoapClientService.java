package fsts.mrurespect.springclient.service;

import proxy.Compte;

import java.util.List;

public interface SoapClientService {
     Compte getCompte(int id) ;
     List<Compte> listComptes();
     double conversion(double amount) ;
}
