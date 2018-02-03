package com.companybitmix;

public class Main {

    public static void main(String[] args) {
        AnimalDomestico g;
        AnimalDomestico p;
        Veterinario vet;
        //g = new Gato("Cat","blanco");
        p = new Perro("Dog", "cafe");
        vet = new Veterinario(p);
        vet.curar();
        //g.saludar();
        //p = new Perro("Dog","cafe");
        // p.saludar();
    }
}
