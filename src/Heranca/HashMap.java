/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;
import java.util.Map;

/**
 *
 * @author natal
 */
public class HashMap {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        java.util.HashMap<Character, Integer> alfabeto = new java.util.HashMap();

        alfabeto.put('a', 0);
        alfabeto.put('b', 0);
        
        System.out.println("Qual o texto?");
        String texto = br.readLine();
        
        for (int i = 0; i <texto.length(); i++) {
            char letra = texto.charAt(i);
            
            int quantidade = alfabeto.get(letra);
            
            alfabeto.put(letra, quantidade + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : alfabeto.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            
            
             System.out.println("A letra " + key + " apareceu " + value + " vezes.");
        }

    }
  
}
