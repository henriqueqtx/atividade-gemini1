/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade.gemini1.adocao;

/**
 *
 * @author rique
 */
public class AdocaoService {
    
    public void realizarAdocao(IAdocaoRepository repository, Adocao adocao, double taxa){
        if((adocao.getAnimal() == null) || (adocao.getAdotante() == null)){
            throw new RuntimeException("Animal ou Adotante Invalidos!");
        }
        
        repository.adicionarAdocao(adocao, taxa);
    }
}
