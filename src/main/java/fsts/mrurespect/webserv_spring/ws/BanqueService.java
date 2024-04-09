package fsts.mrurespect.webserv_spring.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;


@WebService
public interface BanqueService {

    @WebMethod(operationName = "conversion")
    public double conversion(@WebParam(name = "montant")  double mt);
    @WebMethod
    public Compte getCompte(@WebParam int code) ;
    @WebMethod
    public List<Compte> listComptes() ;
}
