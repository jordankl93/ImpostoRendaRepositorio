/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cgt;

import com.jordan.cdp.CalcImpostoNivel1;
import com.jordan.cdp.CalcImpostoNivel2;
import com.jordan.cdp.CalcImpostoNivel3;
import com.jordan.cdp.CalcImpostoNivel4;
import com.jordan.cdp.CalcImpostoNivel5;
import com.jordan.cdp.CalcImpostoStrategy;

/**
 *
 * @author Jordan-Not
 */
public class AplCalcularIR {
    private CalcImpostoStrategy impostoRenda;
    
    public double CalculaImposto(double salario){
        if(salario < 1710.78)
            this.impostoRenda = new CalcImpostoNivel1();
        else
            if(salario >= 1710.78 && salario < 2563.91)
                this.impostoRenda = new CalcImpostoNivel2();
            else
                if(salario >= 2563.91 && salario < 3418.59)
                    this.impostoRenda = new CalcImpostoNivel3();
                else
                    if(salario >= 3418.59 && salario < 4271.59)
                        this.impostoRenda = new CalcImpostoNivel4();
                    else
                        this.impostoRenda = new CalcImpostoNivel5();   
        
        return this.impostoRenda.CalculaImposto(salario);
    }
    
}
