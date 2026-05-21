/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade.gemini1.adocao;

import java.util.List;

/**
 *
 * @author rique
 */
public class AdocaoRepositoryBD implements IAdocaoRepository{
    private String bd;
    
    public void conectarBD(String bd){
        //Implementa conexao do bd
        System.out.println("BD conectado");
    }
    
    @Override
    public void adicionarAdocao(Adocao adocao, double taxa){
           
        conectarBD(bd);
        //Adiciona no BD
        System.out.println("Adoção registrada:" + adocao + "valor:" + taxa);
       
    }    
      
}
