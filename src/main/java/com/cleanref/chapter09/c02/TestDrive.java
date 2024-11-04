package com.cleanref.chapter09.c02;

public class TestDrive {

    // TDD: Tasarım - Test-Kod - Test

    /*
        Kural1: Başarısız olan 1 tane unit test yazmadan kod yazma
        Kural2: Yalnızca başarısız olmaya yetecek kadar test kodu yazın
        Kural3: Testlerinizi başarılı yapacak en az miktarda kodu yazın
     */

    public static void main(String[] args) {
        CreditCalculation creditCalculation = new CreditCalculation();
        System.out.println(creditCalculation.creditCalculator(-1000, 3));
    }


    // BDD -> Cucumber - https://www.softwaretestinghelp.com/cucumber-bdd-tutorial/

}
