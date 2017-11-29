/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufba.model;

import java.util.HashMap;

/**
 *
 * @author brenno
 */
public class Usuario {
    private String nome;
    private HashMap<Double, Integer> qtdLikeTemp;
    private HashMap<Double, Integer> qtdLikelumino;

    public Usuario(String nome){
        this.nome = nome;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the qtdLikeTemp
     */
    public HashMap<Double, Integer> getQtdLikeTemp() {
        return qtdLikeTemp;
    }

    /**
     * @param qtdLikeTemp the qtdLikeTemp to set
     */
    public void setQtdLikeTemp(HashMap<Double, Integer> qtdLikeTemp) {
        this.qtdLikeTemp = qtdLikeTemp;
    }

    /**
     * @return the qtdLikelumino
     */
    public HashMap<Double, Integer> getQtdLikelumino() {
        return qtdLikelumino;
    }

    /**
     * @param qtdLikelumino the qtdLikelumino to set
     */
    public void setQtdLikelumino(HashMap<Double, Integer> qtdLikelumino) {
        this.qtdLikelumino = qtdLikelumino;
    }
    
    
    
}
