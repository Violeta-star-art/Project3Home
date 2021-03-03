package com.company;

import com.sun.xml.internal.bind.v2.runtime.Name;

import javax.xml.namespace.QName;
import java.sql.SQLOutput;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");
        sayHello( " Violeta");
        sayGoodbye( " Team");
        System.out.println("Easter");

    }

    public static void sayHello(String name){
        System.out.println("Hello " +name);
    }
    public static void sayGoodbye(String name){
        System.out.println("Good bye" +name);
    }
}
