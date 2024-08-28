package org.example.practice;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
public class Dollar {
    int amount;
    public void times(int mutiplier){
        amount = amount*mutiplier;
    }
}
