package com.example.springboottdd.assertjtest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DogTest {

    @Test
    void testDOG(){
        Dog fido = new Dog("Fido", 5.25);
        Dog fidoClone = new Dog("Fido", 5.25);

        assertThat(fido).isEqualTo(fidoClone);

    }


}
