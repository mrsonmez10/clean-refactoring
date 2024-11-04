package com.cleanref.chapter03.c05.structural;

public class TestDriveFacade {
    /*
        provides a unified interface to a set of interfaces in a subsystem, making the subsystem easier to use
        Developers often use the facade design pattern when a system is very complex or difficult to understand
        because the system has many interdependent classes or because its source code is unavailable.
        This pattern hides the complexities of the larger system and provides a simpler interface to the client.
     */

    public static void main(String[] args) {
        BankingFacade bankingFacade = new BankingFacade();
        bankingFacade.getAccountDetails("123456");
        bankingFacade.transferFunds("123456", "654321", 100.0);
        bankingFacade.payBill("123456", "BILL001", 50.0);
    }
}
