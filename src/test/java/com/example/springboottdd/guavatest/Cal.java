package com.example.springboottdd.guavatest;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Cal {

    public Integer sum(Integer n1, Integer n2){
        return n1+n2;
    }


    public Integer sum(Optional<Integer> a, Optional<Integer> b) {
        return a.get() + b.get();
    }
}
