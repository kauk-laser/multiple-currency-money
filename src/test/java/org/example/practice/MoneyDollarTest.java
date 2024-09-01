package org.example.practice;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MoneyDollarTest {

    @Test
    public void times_fiveDollarsMutiplyTwo_tenDollars() {
        Money fiveDollar = Money.dollar(5);

        Assert.assertEquals(Money.dollar(10), fiveDollar.times(2));
    }

    @Test
    public void times_timesDollarsTwice_notChangeOriginDollar() {
        Money sixDollar = Money.dollar(6);

        sixDollar.times(5);
        sixDollar.times(2);

        Assert.assertEquals(Money.dollar(6),sixDollar);
    }

    @Test
    public void equals_sameDollar_true() {
        Money fiveDollar = Money.dollar(5);
        Money fiveDollar2 = Money.dollar(5);

        Assert.assertEquals(fiveDollar, fiveDollar2);
    }

    @Test
    public void equals_differentDollar_false() {
        Money fiveDollar = Money.dollar(5);
        Money tenDollar = Money.dollar(10);

        Assert.assertNotEquals(fiveDollar, tenDollar);
    }

    @Test
    public void currency_fiveDollar_returnUSD() {
        Money fiveDollar = Money.dollar(5);
        Assert.assertEquals("USD", fiveDollar.currency());
    }

}
