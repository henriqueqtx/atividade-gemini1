/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade.gemini1.adocao;

import com.mycompany.atividade.gemini1.Adotante;
import com.mycompany.atividade.gemini1.Animal;

/**
 *
 * @author rique
 */
public class Adocao {
    private Animal animal;
    private Adotante adotante;

    public Adocao(Animal animal, Adotante adotante) {
        this.animal = animal;
        this.adotante = adotante;
    }
    
    

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Adotante getAdotante() {
        return adotante;
    }

    public void setAdotante(Adotante adotante) {
        this.adotante = adotante;
    }

    @Override
    public String toString() {
        return "Adocao{" + "animal=" + animal + ", adotante=" + adotante + '}';
    }
    
    
}
