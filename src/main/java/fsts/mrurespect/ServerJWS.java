package fsts.mrurespect;

import fsts.mrurespect.ws.BanqueService;
import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
         Endpoint.publish("http://0.0.0.0:9191/", new BanqueService()); // publish the service on the network
          System.out.println("Server is running on http://localhost:9191/");
    }
}
