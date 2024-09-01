package org.example.practice;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MoneyTest {

    @Test
    public void equal_sameAmountDollarAndFrance_notEqual(){
        Money fiveDollar = Money.dollar(5);
        Money fiveFrance = Money.france(5);
        Assert.assertNotEquals(fiveDollar, fiveFrance);
    }
}
