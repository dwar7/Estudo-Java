/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudo;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Estudo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        process p = new process();
        
        System.out.println("Insira um numero: ");
        p.setNumeroInteiro(scanf.nextInt());
        System.out.println(p.getNumeroInteiro());
    }

}
