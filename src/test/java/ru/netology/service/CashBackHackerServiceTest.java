package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashBackHackerServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
   }

   @org.testng.annotations.Test
    public void testRemainWithCachback() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
   }
}
