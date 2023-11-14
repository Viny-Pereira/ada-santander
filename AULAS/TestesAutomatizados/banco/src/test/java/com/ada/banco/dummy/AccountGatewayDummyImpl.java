package com.ada.banco.dummy;

import com.ada.banco.domain.gateway.AccountGateway;
import com.ada.banco.domain.model.Account;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class AccountGatewayDummyImpl implements AccountGateway {

    private Map<String, Account> accounts = new HashMap<>();

    public AccountGatewayDummyImpl() {
        accounts.put("12345678900", new Account(101L, 0001L, 1234L, new BigDecimal("1000.00"), "Alice", "12345678900"));
        accounts.put("98765432100", new Account(102L, 0001L, 1235L, new BigDecimal("2000.00"), "Bob", "98765432100"));
    }

    @Override
    public Account searchByCpf(String cpf) {
        return accounts.get(cpf);
    }

    @Override
    public Account save(Account account) {
        accounts.put(account.getCpf(), account);
        return account;
    }
}
