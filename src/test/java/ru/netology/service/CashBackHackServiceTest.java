package ru.netology.service;


import static org.testng.Assert.assertEquals;

public class CashBackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldReturn1000() {
    CashBackHackService service = new CashBackHackService();

    int amount = 0;

    int expected = 1000;
    int actual = service.remain(amount);

    assertEquals(actual, expected);

    }

    @org.testng.annotations.Test

    public void shouldReturn900() {
        CashBackHackService service = new CashBackHackService();

        int amount = 100;

        int expected = 900;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldReturnZero() {
        CashBackHackService service = new CashBackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldReturn700() {
        CashBackHackService service = new CashBackHackService();

        int amount = 1300;

        int expected = 700;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }


}