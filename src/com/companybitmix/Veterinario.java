package com.companybitmix;

public class Veterinario {
    AnimalDomestico animal;
    public Veterinario(AnimalDomestico animal){
        this.animal = animal;
    }
    public void curar(){
        if(this.animal instanceof Gato){
            System.out.println("estoy curando un gato");
        }else{
            System.out.println("estoy curando un perro");
        }

        this.animal.saludar();
    }
}
