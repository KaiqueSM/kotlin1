package com.example.section6;

import com.example.section5.generics.MaxKt;

public class ConnWithKotlin {

    public static void main(String[] args) {
        Person person1 = new Person("Rob", "Scalon");
        Person person2 = new Person("Martin", "Lutter", "King");

        Integer maxInt = MaxKt.max(10,20);
        System.out.printf(maxInt+"");
    }
}
