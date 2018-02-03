package com.companybitmix;

abstract public class AnimalDomestico {//cuando es depende
    protected String nombre;
    protected String color;

    public AnimalDomestico(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    abstract public void saludar();
}