package com.example.springboottdd.assertjtest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DogTest {

    @Test
    void testDOG(){
        Dog fido = new Dog("Fido", 5.25);
        Dog fidoClone = new Dog("Fido", 5.25);
        assertThat(fido).isEqualTo(fidoClone);
    }

    @Test
    void testBasic(){
        assertThat("".isEmpty()).isFalse();
    }

    @Test
    void testList(){
        List<String> list = Arrays.asList("1", "2", "3");

        assertThat(list)
                .isNotEmpty()
                .contains("1")
                .doesNotContain("4")
                .containsSequence("2","3");
    }

    @Test
    void testEquals(){
        int n1 = 1;
        int n2 = 1;

        assertThat(n1).isEqualTo(n2);
    }


}
