package org.sid.tpjaxws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.sid.tpjaxws.logic.Account;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BankWS")
public class BankService {

    @WebMethod(operationName = "convertEuroToDH")
    public double convert(@WebParam(name = "amount") double mt) {
        return mt * 10.6;
    }

    @WebMethod
    public Account getAccount(@WebParam(name = "code") int code) {
        return new Account(code, Math.random() * 97000, new Date());
    }

    @WebMethod
    public List<Account> listAccounts() {
        return List.of(
                new Account(1, Math.random() * 97000, new Date()),
                new Account(2, Math.random() * 97000, new Date()),
                new Account(3, Math.random() * 97000, new Date())
        );
    }

}
