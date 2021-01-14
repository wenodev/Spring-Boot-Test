package com.example.springboottdd.guavatest;

import com.google.common.base.Preconditions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GuavaTest {

    Cal cal;

    @BeforeEach
    public void init() {
        cal = new Cal();
    }


    @Disabled
    @Test
    void test(){

        Integer a = 10;
        Integer b = 10;

        assertEquals(20, cal.sum(a,b));
    }

    @Disabled
    @Test
    void testOptional(){

        Integer invalidInput = null;

        Optional<Integer> a = Optional.of(invalidInput);
        Optional<Integer> b = Optional.of(new Integer(10));

        assertEquals(10, cal.sum(a,b));

    }

    @Disabled
    @Test
    void testOptional_두번째(){
        Integer v1 = null;
        Integer v2 = new Integer(10);

        Optional<Integer> a = Optional.ofNullable(v1);
        Optional<Integer> b = Optional.of(v2);

        assertEquals(cal.sum(a,b), 10);

    }

    @Test
    public void whenCheckArgumentEvaluatesFalse_throwsException(){

        int age = -18;


        assertThatThrownBy( ()-> Preconditions.checkArgument(age > 0)  )
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(null).hasNoCause();


    }


}
