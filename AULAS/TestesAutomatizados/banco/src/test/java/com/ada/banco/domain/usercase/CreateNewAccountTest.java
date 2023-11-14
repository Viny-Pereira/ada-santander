package com.ada.banco.domain.usercase;

import com.ada.banco.domain.gateway.AccountGateway;
import com.ada.banco.domain.model.Account;
import com.ada.banco.domain.usecase.CreateNewAccount;
import com.ada.banco.dummy.AccountGatewayDummyImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CreateNewAccountTest {
    @Test
    public void throwsExceptionIfUserAlreadyHasAccount() {
        AccountGateway accountGateway = new AccountGatewayDummyImpl();
        CreateNewAccount createNewAccount = new CreateNewAccount(accountGateway);
        Account account = new Account(1231L, 0002L, 1L,
                BigDecimal.valueOf(10000), "Ligia", "12312445212");
        Assertions.assertThrows(Exception.class, () -> createNewAccount.execute(account));
    }

    @Test
    public void creatNewAccount() throws Exception {
        AccountGateway accountGateway = new AccountGatewayDummyImpl();
        CreateNewAccount createNewAccount = new CreateNewAccount(accountGateway);
        Account account = new Account(1231L, 0002L, 1L,
                BigDecimal.valueOf(10000), "Ligia", "12312445212");
        Account newAccount = createNewAccount.execute(account);
        Assertions.assertAll(
                () -> Assertions.assertEquals("Ligia", account.getOwner()),
                () -> Assertions.assertEquals("12312445212", account.getCpf()),
                () -> Assertions.assertEquals(1231L, account.getId())
        );
    }
}
