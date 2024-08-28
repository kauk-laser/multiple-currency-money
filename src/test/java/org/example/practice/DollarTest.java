package org.example.practice;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DollarTest {

    @Test
    public void times_fiveDollarsMutiplyTwo_tenDollars() {
        Dollar fiveDollar = new Dollar(5);
        fiveDollar.times(2);
        Assert.assertEquals(10,fiveDollar.amount);
    }

    @Test
    public void times_sixDollarsMutiplyFive_thirtyDollars() {
        Dollar sixDollar = new Dollar(6);
        sixDollar.times(5);
        Assert.assertEquals(30,sixDollar.amount);
    }

}
