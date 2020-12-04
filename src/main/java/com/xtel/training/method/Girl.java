package com.xtel.training.method;

import java.lang.reflect.Method;
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
    public static void main(String[] args) throws Exception {
        Class<Girl> girlClass = Girl.class;

        // Su dung getDeclaredMethods de lay ra nhung method cua class va cha no.
        Method[] methods = girlClass.getDeclaredMethods();
        for(Method method : methods){
            System.out.println();
            System.out.println("Method: " + method.getName());
            System.out.println("Parameters: " + Arrays.toString(method.getParameters()));
        }

        // Lay ra method ten la setName va co 1 tham so truyen vao -> setName(String name)
        Method methodSetName = girlClass.getMethod("setName", String.class);

        Girl girl = new Girl();

        methodSetName.invoke(girl, "Ngoc Trinh");
        System.out.println(girl);
    }
}
