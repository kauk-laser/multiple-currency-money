package org.example.practice;

import org.junit.Assert;
import org.junit.Test;

public class MoneyFranceTest {
    @Test
    public void times_fiveFrancesMutiplyTwo_tenFrances() {
        Money fiveFrance = Money.france(5);

        Assert.assertEquals(Money.france(10), fiveFrance.times(2));
    }

    @Test
    public void times_timesFrancesTwice_notChangeOriginFrance() {
        Money sixFrance = Money.france(6);

        sixFrance.times(5);
        sixFrance.times(2);

        Assert.assertEquals(Money.france(6),sixFrance);
    }

    @Test
    public void equals_sameFrance_true() {
        Money fiveFrance = Money.france(5);
        Money fiveFrance2 = Money.france(5);

        Assert.assertEquals(fiveFrance, fiveFrance2);
    }

    @Test
    public void equals_differentFrance_false() {
        Money fiveFrance = Money.france(5);
        Money tenFrance = Money.france(10);

        Assert.assertNotEquals(fiveFrance, tenFrance);
    }

    @Test
    public void currency_fiveFrance_returnCHF() {
        Money fiveFrance = Money.france(5);
        Assert.assertEquals("CHF", fiveFrance.currency());
    }
}
