package com.companybitmix;

public class Gato extends AnimalDomestico{
    public Gato(String nombre, String color) {
        super(nombre, color);
    }
    public void saludar() {
        System.out.println("Miau, miau");
    }
}
