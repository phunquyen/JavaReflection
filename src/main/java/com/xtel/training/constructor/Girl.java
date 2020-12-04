package com.xtel.training.constructor;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Girl {
    private String name;

    public Girl() {

    }

    public Girl(String name) {
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girl{" + "name='" + name + '\'' + '}';
    }

    public static void main(String[] args) {
        Class<Girl> girlClass = Girl.class;
        System.out.println("Class: " + girlClass.getSimpleName());
        System.out.println("Constructors: " + Arrays.toString(girlClass.getConstructors()));
        try {
            Girl girl1 = girlClass.newInstance();
            System.out.println("Girl1: " + girl1);

            Constructor<Girl> girlConstructor = girlClass.getConstructor(String.class);
            Girl girl2 = girlConstructor.newInstance("Hello");

            System.out.println("Girl2: " + girl2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
