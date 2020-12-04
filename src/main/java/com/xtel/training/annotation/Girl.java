package com.xtel.training.annotation;

import com.sun.istack.internal.Nullable;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@SuppressWarnings("deprecation")
@Deprecated
public class Girl {
    private String name;

    public Girl() {

    }

    public Girl(String name) {
        this.name = name;
    }

    @Nullable
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girl{" + "name='" + name + '\'' + '}';
    }

    public static void main(String[] args) {
        Class<Girl> girlClass = Girl.class;
        System.out.println("Ten class: "+girlClass.getSimpleName());
        for(Annotation annotation : girlClass.getDeclaredAnnotations()){
            System.out.println("Cac Annotation trong class: " + annotation.annotationType());
        }

        for(Method method: girlClass.getDeclaredMethods()){
            System.out.println("Ten Method: " + method.getName());
            for(Annotation annotation : method.getAnnotations()){
                System.out.println("Ten cac annotation trong class: " + annotation.annotationType());
            }
        }
    }
}