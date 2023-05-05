package AM_Default.pack;

import java.util.Map;

//I make a default class and this class can be used in another package it will give compile time error.
class Simple {
 void msg()
{
    System.out.println("Hello");
}
}
class Mysimple extends Simple
{
    public static void main(String[] args) {
        Mysimple m = new Mysimple();
        m.msg();
    }
}
