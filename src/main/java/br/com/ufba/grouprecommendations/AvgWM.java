/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufba.grouprecommendations;

import br.com.ufba.model.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author brenno
 */
public class AvgWM {
    public static void main(String[] args) {
        
        List<Usuario> listTempUsuario = new ArrayList<>();
        
        Usuario usu1 = new Usuario("Brenno");
        HashMap<Double, Integer> likes1 = new HashMap<>();
        likes1.put(22.00, 6);
        likes1.put(25.00, 5);
        likes1.put(28.00, 2);
        usu1.setQtdLikeTemp(likes1);
        
        Usuario usu2 = new Usuario("João");
        HashMap<Double, Integer> likes2 = new HashMap<>();
        likes2.put(22.00, 10);
        likes2.put(25.00, 8);
        likes2.put(28.00, 2);
        usu2.setQtdLikeTemp(likes2);
        
        Usuario usu3 = new Usuario("Flavio");
        HashMap<Double, Integer> likes3 = new HashMap<>();
        likes3.put(22.00, 6);
        likes3.put(25.00, 8);
        likes3.put(28.00, 1);
        usu3.setQtdLikeTemp(likes3);
        
        
        listTempUsuario.add(usu1);
        listTempUsuario.add(usu2);
        listTempUsuario.add(usu3);
        
        double mediaA;
        mediaA = 0;
        Integer mediaB;
        mediaB = 0; 
        double mediaC;
        mediaC = 0;
        for (Usuario usuario : listTempUsuario) {
            HashMap<Double, Integer> temperature = usuario.getQtdLikeTemp();
            if(temperature.get(22.00)>2){
                mediaA += temperature.get(22.00);
                mediaB += temperature.get(25.00);
                mediaC += temperature.get(28.00);      
            }    
        }
        
        System.out.println(mediaA/listTempUsuario.size());
        System.out.println(mediaB/listTempUsuario.size());
        System.out.println(mediaC/listTempUsuario.size());
    }
    
    
}
