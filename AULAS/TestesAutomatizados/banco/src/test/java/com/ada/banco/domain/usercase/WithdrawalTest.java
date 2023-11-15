package com.ada.banco.domain.usercase;

import com.ada.banco.domain.gateway.AccountGateway;
import com.ada.banco.domain.model.Account;
import com.ada.banco.domain.usecase.Withdrawal;
import com.ada.banco.dummy.AccountGatewayDummyImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WithdrawalTest {
    private Withdrawal withdrawal;
    @BeforeEach
    public void setUp() {
        AccountGateway accountGateway = new AccountGatewayDummyImpl();
        withdrawal = new Withdrawal(accountGateway);
    }

    @Test
    public void throwUnregisteredUserExceptionTest(){
        Account account = new Account(1231L, 0002L, 1L,
                BigDecimal.valueOf(10000), "Ligia", "12312445212");
        BigDecimal amountWithdrawal = new BigDecimal(1000);

        Throwable throwable;
        throwable = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            withdrawal.execute(account, amountWithdrawal);
        });

        Assertions.assertEquals("Account not find in our database", throwable.getMessage());

    }

    @Test
    public void throwInsufficientBalanceExceptionTest(){
        Account account = new Account(101L, 0001L, 1234L, new BigDecimal("1000.00"), "Alice", "12345678900");
        BigDecimal amountWithdrawal = new BigDecimal(100000);

        Throwable throwable;
        throwable = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            withdrawal.execute(account, amountWithdrawal);
        });

        Assertions.assertEquals("The balance is lower than the amount you wish to withdraw", throwable.getMessage());
    }
    @Test
    public void successfulWithdrawalTest(){
        Account account = new Account(101L, 0001L, 1234L, new BigDecimal("1000.00"), "Alice", "12345678900");
        BigDecimal amountWithdrawal = new BigDecimal("1000");
        withdrawal.execute(account, amountWithdrawal);
        BigDecimal expectedBalance = new BigDecimal("0.00");

        Assertions.assertEquals(expectedBalance, account.getBalance());
    }
}
