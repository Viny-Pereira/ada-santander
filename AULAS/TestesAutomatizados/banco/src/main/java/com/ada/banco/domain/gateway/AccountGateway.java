package com.ada.banco.domain.gateway;

import com.ada.banco.domain.model.Account;

public interface AccountGateway {
    Account searchByCpf(String cpf);
    Account save(Account account);

}
