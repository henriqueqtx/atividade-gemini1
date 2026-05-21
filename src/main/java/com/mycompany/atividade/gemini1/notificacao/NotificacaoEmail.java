/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade.gemini1.notificacao;

import com.mycompany.atividade.gemini1.adocao.Adocao;

/**
 *
 * @author rique
 */
public class NotificacaoEmail implements INotificacao{
    
    @Override
    public void emitirNotificacao(Adocao adocao){
        System.out.println("Notificacao emitida sobre a adocao:" + adocao);
    }
    
}
