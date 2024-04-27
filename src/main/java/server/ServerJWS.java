package server;

import jakarta.xml.ws.Endpoint;
import org.sid.tpjaxws.BankService;

public class ServerJWS  {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8084/";
        Endpoint.publish(url, new BankService());
        System.out.println("Web service deployed on " + url);
    }
}
