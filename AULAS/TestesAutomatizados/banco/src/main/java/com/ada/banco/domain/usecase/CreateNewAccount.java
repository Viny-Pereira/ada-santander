package com.ada.banco.domain.usecase;

import com.ada.banco.domain.gateway.AccountGateway;
import com.ada.banco.domain.model.Account;

public class CreateNewAccount {
    private final AccountGateway accountGateway;

    public CreateNewAccount(AccountGateway accountGateway) {
        this.accountGateway = accountGateway;
    }

    public Account execute(Account account) throws Exception {
        // validar se o usuario ja possui uma conta
        if(accountGateway.searchByCpf(account.getCpf())!=null) {
            // - se possuir vamos lancar uma exception
            throw new Exception("User already has a account ");
        }

        // criar uma nova conta
        Account newAccount = accountGateway.save(account);

        //return Conta;
        return newAccount;
    }
}
