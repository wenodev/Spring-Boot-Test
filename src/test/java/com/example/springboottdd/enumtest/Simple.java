package com.example.springboottdd.enumtest;

public enum Simple {
    DOG("멍멍"),
    CAT("야용");

    private String cry;

    Simple(String cry) {
        this.cry = cry;
    }

    public String getCry(){
        return cry;
    }

}
