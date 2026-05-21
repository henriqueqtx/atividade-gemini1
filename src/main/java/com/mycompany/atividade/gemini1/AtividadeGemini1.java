/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.gemini1;

import com.mycompany.atividade.gemini1.adocao.Adocao;
import com.mycompany.atividade.gemini1.adocao.AdocaoRepositoryBD;
import com.mycompany.atividade.gemini1.adocao.AdocaoService;
import com.mycompany.atividade.gemini1.adocao.IAdocaoRepository;
import com.mycompany.atividade.gemini1.taxas.CalculaTaxaService;
import com.mycompany.atividade.gemini1.taxas.ITipoTaxa;
import com.mycompany.atividade.gemini1.taxas.TipoTaxaCachorroImpl;

/**
 *
 * @author rique
 */
public class AtividadeGemini1 {

    public static void main(String[] args) {
        
        Animal animal = new Animal("Bob", "Cachorro");
        Adotante adotante = new Adotante("Pedro", 101);
        IAdocaoRepository repository = new AdocaoRepositoryBD();
        
        Adocao adocao = new Adocao(animal, adotante);
        AdocaoService adocaoService = new AdocaoService();
        
        ITipoTaxa tipoTaxa = new TipoTaxaCachorroImpl();
        CalculaTaxaService CalculaTaxaService = new CalculaTaxaService(tipoTaxa);
        double taxa = CalculaTaxaService.calculaTaxa();
        
        adocaoService.realizarAdocao(repository, adocao, taxa);
        
       
    }
}
