package com.xtel.training.field;

import java.lang.reflect.Field;

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
        return "Girl{" + "name = '" + name + '\'' + '}';
    }

    public static void main(String[] args) throws Exception {
        Girl girl = new Girl();
        girl.setName("Ngoc trinh");

        // Lay ra tat ca field cua object
        for(Field field : girl.getClass().getDeclaredFields()){
            System.out.println();
            System.out.println("Field: " +field.getName());
            System.out.println("Type: " +field.getType());
        }

        Field nameField = girl.getClass().getDeclaredField("name");
        nameField.setAccessible(true); // Cho truy cap tam thoi

        nameField.set(girl, "Bella");

        System.out.println(girl);
    }
}
