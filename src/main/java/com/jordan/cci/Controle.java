/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cci;

import com.jordan.cgt.AplCalcularIR;
import com.jordan.cih.Visao;
import java.util.Scanner;

/**
 *
 * @author Jordan-Not
 */
public class Controle {
    private static Scanner ler = new Scanner(System.in);
    private static AplCalcularIR aplCalcularImposto = new AplCalcularIR();    
    
    public void inicia(){        
        double salario;
        
        salario = Visao.digitar(ler);
        
        calcular(salario);
    }
    
    public void calcular(double salario){
        double impostoRenda;
        
        impostoRenda = aplCalcularImposto.CalculaImposto(salario);
        
        Visao.imprimir(salario, impostoRenda);
    }
    
}
