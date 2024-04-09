package fsts.mrurespect.webserv_spring.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@WebService
@Component
public class BanqueServiceImpl implements BanqueService {

    @WebMethod(operationName = "conversion")
    public double conversion(@WebParam(name = "montant")  double mt) {
        return mt * 1.1;
    }
    @WebMethod
    public Compte getCompte(@WebParam int code) {
        return new Compte(code, Math.random()*1234, new Date());
    }
    @WebMethod
    public List<Compte> listComptes() {
        return List.of(
                new Compte(1, Math.random()*1234, new Date()),
                new Compte(2, Math.random()*1234, new Date()),
                new Compte(3, Math.random()*1234, new Date())
        );
    }
}
