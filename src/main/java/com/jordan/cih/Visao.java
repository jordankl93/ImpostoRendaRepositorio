/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cih;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Jordan-Not
 */
public class Visao {
    
    public static double digitar(Scanner s) throws NoSuchElementException {
        
        System.out.println("Digite a expressao polonesa p/ calculadora: ");
        return s.nextDouble();
    
    }
    
    public static void imprimir(double salario, double resultado) throws NoSuchElementException {        
        
        System.out.println("O imposto de renda para o salario R$" + salario + " é de R$" + resultado);    
    
    }
    
}
