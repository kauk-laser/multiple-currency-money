package org.example.practice;

import lombok.AllArgsConstructor;

import java.util.Objects;

/**
 * @author shijian
 */
@AllArgsConstructor
public class Money {
    protected int amount;
    protected String currency;
    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money france(int amount) {
        return new Money(amount,"CHF");
    }

    @Override
    public boolean equals(Object object){
        if(!(object instanceof Money)) {
            return false;
        }
        Money money = (Money)object;
        if(Objects.equals(currency(), money.currency())) {
            return amount == money.amount;
        }else {
            return false;
        }
    }

    public Money times(int mutiplier){
        return new Money(amount * mutiplier, currency);
    }

    public String currency(){
        return currency;
    }
}
