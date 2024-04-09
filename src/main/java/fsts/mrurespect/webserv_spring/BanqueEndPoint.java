package fsts.mrurespect.webserv_spring;

import fsts.mrurespect.webserv_spring.ws.BanqueService;
import fsts.mrurespect.webserv_spring.ws.BanqueServiceImpl;
import fsts.mrurespect.webserv_spring.ws.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BanqueEndPoint {
    private BanqueService banqueService ;

    @Autowired
    public BanqueEndPoint(BanqueService banqueService) {
        this.banqueService = banqueService;
    }
    @PayloadRoot( localPart = "getCompte")
    @ResponsePayload
    public Compte getCompte(@RequestPayload int id) {
        return new BanqueServiceImpl().getCompte(id);
    }
}
