package ru.netology.service;


import static org.junit.Assert.assertEquals;

public class CashBackHackServiceTest {

    @org.junit.Test
    public void ShouldReturn1000() {
    CashBackHackService service = new CashBackHackService();

    int amount = 0;

    int expected = 1000;
    int actual = service.remain(amount);

    assertEquals(expected, actual);

    }

    @org.junit.Test

    public void ShouldReturn900() {
        CashBackHackService service = new CashBackHackService();

        int amount = 100;

        int expected = 900;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void ShouldReturnZero() {
        CashBackHackService service = new CashBackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void ShouldReturn700() {
        CashBackHackService service = new CashBackHackService();

        int amount = 1300;

        int expected = 700;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }


}