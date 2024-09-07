package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashBackHackerServiceTest {
    @org.junit.Test
    public void testRemain() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainWithCashback() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 600;
        int actual = service.remain(amount);
        int expected = 400;
        assertEquals(expected, actual);
    }
}
